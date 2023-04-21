package ProxyDynamic;

import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyReader {

    public static void main(String[] args) {
        Reader original = new UserCustomReader();

        ClassLoader classLoader = original.getClass().getClassLoader();
        Class<?>[] interfaces = original.getClass().getInterfaces();
        var invokeHandler = new CustomInvokeHandler(original);

        Reader reader = (Reader) Proxy.newProxyInstance(
                classLoader,
                interfaces,
                invokeHandler
        );
    }



    static class CustomInvokeHandler implements InvocationHandler {

        private Reader readerCIH;

        CustomInvokeHandler(Reader readerCIH) {
            this.readerCIH = readerCIH;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("invoke-worked!!!");
            if (method.getName().equals("close")) System.out.println("Reader closed!");

            return method.invoke(readerCIH,args);
        }
    }

    private static class UserCustomReader extends Reader {

        private volatile boolean closed;
        @Override
        public int read(char[] cbuf, int off, int len) throws IOException {
            return cbuf.length;
        }

        @Override
        public void close() throws IOException {
            closed = true;
        }
    }



}

