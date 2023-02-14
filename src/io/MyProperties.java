package io;


import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;


public class MyProperties {

    public static Map<String, String> runtimeStorage = new HashMap<>(){{
        put("key", "value");
        put("keyTwo", "valueTwo");
        put("keyThree", "valueThree");
    }};

    public static void save(OutputStream outputStream) throws Exception {
        Properties properties = new Properties();
        properties.putAll(runtimeStorage);
        properties.store(outputStream, "Example of My Properties");
    }

    public static void load(InputStream inputStream) throws IOException {
        Properties properties = new Properties();
        properties.load(inputStream);
        properties.forEach((k,v) ->runtimeStorage.put((String)k,(String)v));

    }

    public static void main(String[] args) throws Exception {


        String filePath = "./src/io/store/outputPro.txt";
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileOutputStream fos = new FileOutputStream(filePath);
             FileInputStream fis = new FileInputStream(filePath /*reader.readLine()*/)) {
            save(fos);
            load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(runtimeStorage);


    }
}
