import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class SetCollections {

    public static void main(String[] args) {
        HashSet<String> listNames = new HashSet<>();
        listNames.add("Ihor");
        listNames.add("Olga");
        listNames.add("Artem");
        listNames.add("Egor");
        listNames.add("Anya");
        listNames.add("Ihor");

        for (String elementCollection : listNames) {
            System.out.print(elementCollection);
        }

        System.out.println("Sorted :");
        TreeSet<String> listSorted = new TreeSet<>();
        listSorted.addAll(listNames);

        for (String elementCollection : listSorted) {
            System.out.println(elementCollection);
        }

    }

}
