package string;

// посчитать колличество слов в строке

public class Amount {


    public void amountMetohod() {
        String str = " Абстрактные    классы в   Java на конкретных  примерах ";
        String[] arr = str.trim().replaceAll("\\s{2,}", " ").split(" ");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " | ");
        }
        System.out.println("\n" + "amount words = " + arr.length);


    }



}
