package collections.CollectionsMap;
//java.lang.StackOverflowError
public class MyArray {

   public static Integer[] a = {10, 15, 16, 13};

    public static void recursia(Integer[] x){
        int j = 1;
        for (int i : x) {
            j++;
            System.out.print(i+j + " ");
            System.out.println();
            recursia(x);
        }

    }


    public static void main(String[] args) {

        recursia(a);

    }


}
