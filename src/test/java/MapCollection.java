import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class MapCollection {

    public static void main(String[] args) {

        Map<Integer,String> collection = new HashMap<>();
        collection.put(3, "Ihor");
        collection.put(2, "Anya");
        collection.put(5, "Roman");
        collection.put(1, "Elena");
        collection.put(4, "Egor");

//        sorting with key
        TreeMap<Integer,String> sortedMapByKey = new TreeMap<>();
        sortedMapByKey.putAll(collection);

        System.out.println("Sorting map by key:");
        for (Map.Entry entry : sortedMapByKey.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }


        //sorting with value
       Map <Integer, String> sortedMapByValue = collection.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (e1, e2) -> e1,
                                LinkedHashMap::new));

        System.out.println("Sorting map by value:");
        for (Map.Entry entry : sortedMapByValue.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: "
                    + entry.getValue());
        }
    }

}
