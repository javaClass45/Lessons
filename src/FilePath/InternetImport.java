package FilePath;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class InternetImport {

    public static void main(String[] args) throws IOException {
        URL url = new URL("https://cdn.javarush.com/images/article/0da55da0-84a4-439e-85aa-650b1e22a42a/800.webp");
        InputStream inputStream = url.openStream();
        Path tempFile = Files.createTempFile("temp-", ".tmp" );
        Files.copy(inputStream, tempFile);
    }

}
