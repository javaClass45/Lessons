package patterns.Observ;

import java.util.*;

public class Director implements Observer {
    public void event(List<String> strings) {
        System.out.println("The list of students has changed: " + strings);
    }

}
