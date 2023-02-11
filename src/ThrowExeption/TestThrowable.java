package ThrowExeption;

public class TestThrowable {

    public static void main(String[] args) {


        try {

            throw new Throwable();
//            throw new Error();
//            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }catch (Error error) {
            error.printStackTrace();
        }catch (Throwable throwable) {
            throwable.printStackTrace();
        }




        try {
            throw new Throwable();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        try {
            throw new Error();
        } catch (Error error) {
            error.printStackTrace();
        }

        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
