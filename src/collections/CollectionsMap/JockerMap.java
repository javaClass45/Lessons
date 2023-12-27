package collections.CollectionsMap;

import java.util.HashMap;
import java.util.Map;

public class JockerMap {

    public static void main(String[] args) {


        Map<String, Map<String, String>> map = new HashMap<>(){{
            put("мои", new HashMap<>(){{
                put("пять", "копеек");
            }});
            put("Антон Архипов", new HashMap<>(){{
                put("Эффективная работа с IDE(A)",
                        "https://www.youtube.com/watch?v=_rj7dx6c5R8&ab_channel=JPoint%2CJoker%D0%B8JUGru");
            }});
        }};

        System.out.println(map);

        

    }
}
