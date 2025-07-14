package local.collections;

import java.util.HashMap;
import java.util.Map;

public class Demo09Map {

    Map<Character, String> map = new HashMap<>();
    
    
    public void useMap() {
        map.put('A', "Alpha");
          map.put('B', "Betta");
            map.put('C', "Charlie");

            map.put('A', "Alfa");


    }

        public void showMap() {
            System.out.println(map);
            System.out.println(map.values());
            System.out.println();

        }

    public static void main(String[] args) {
        Demo09Map map = new Demo09Map(); 

        }
    }


