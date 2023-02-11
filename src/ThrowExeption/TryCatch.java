package ThrowExeption;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.FindException;

public class TryCatch {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");;
            throw new IndexOutOfBoundsException();
        }catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");

        }catch (Exception e) {
            System.out.println("Exception");
        }
    }

}
