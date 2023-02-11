package string;

public class Chain {


    public static void main(String[] args) {

        String[] words = {"Киев", "Нью-Йорк", "Амстердам", "Вена", "Мельбурн"};
        System.out.println("getString(words) = " + getLine(words));

    }

    public static StringBuilder getLine(String... words) {
        StringBuilder result = new StringBuilder();
        String first;
        String last = words[0].substring((words[0].length() - 1), words[0].length());
        result.append(words[0]).append(" ");
        words[0] = " ";
        for (int j = 0; j < words.length; j++) {
            first = words[j].substring(0, 1);
            if (first.equalsIgnoreCase(last)) {
                result.append(words[j]).append(" ");
                last = words[j].substring((words[j].length() - 1), words[j].length());
                words[j] = " ";
                j = 0;
                if (testArr(words)) return result.deleteCharAt(result.length() - 1);
            }
        }//forj
        return result;
    }

    public static Boolean testArr(String... words) {
        int count = 0;
        for (String s : words) {
            if (s.equals(" ")) count++;
        }
        return count == words.length;
    }


}
