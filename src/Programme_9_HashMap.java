import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Programme_9_HashMap {

    public static void main(String[] args) {
       HashMap <String,Integer> map = new HashMap<>();
       map.put("Bhavisha",10);
       map.put("Uma",20);
        map.put("Hinal",30);

        for (Map.Entry<String,Integer> people : map.entrySet()){
            System.out.println(people.getKey()+ "" +people.getValue());
        }
        //Iterate by iterator
        Iterator<Map.Entry<String,Integer>> peopleList = map.entrySet().iterator();
        while (peopleList.hasNext()){
            System.out.println(peopleList.next());
        }
    }
}
