import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCollections {

    public static void main(String[] args) {


        List<String> stringList = new ArrayList<>();
        stringList.add("Ihor");
        stringList.add("Olga");
        stringList.add("Egor");
        stringList.add("Anya");
        stringList.add("Artem");

        for (int i = stringList.size() - 1; i >= 0; i--) {
            System.out.println(stringList.get(i));
        }

        System.out.println("asList: ");
        List<String> stringListAddAsList = Arrays.asList("Name", "Surname", "Phone", "Email");
        for (String element : stringListAddAsList) {
            System.out.println(element);
        }

        System.out.println("asList: ");
        List<String> stringListAddWithIndex = new ArrayList<>();
        stringListAddWithIndex.add("Ihor");
        stringListAddWithIndex.add("Olga");
        stringListAddWithIndex.add("Egor");
        stringListAddWithIndex.add("Anya");
        stringListAddWithIndex.add("Artem");
        System.out.println(stringListAddWithIndex.size());
        stringListAddWithIndex.add(3, "Roman");
        System.out.println(stringListAddWithIndex.size());

        List<String> stringListRemove = new ArrayList<>();
        stringListRemove.add("Ihor");
        stringListRemove.add("Olga");
        stringListRemove.add("Egor");
        stringListRemove.add("Anya");
        stringListRemove.add("Artem");
        System.out.println("List before remove: ");
        System.out.println(stringListRemove.size());
        for (int i = 0; i < stringListRemove.size(); i++) {
            System.out.println(stringListRemove.get(i));
        }
        stringListRemove.remove(3);
        System.out.println("List after remove: ");
        System.out.println(stringListRemove.size());
        for (int i = 0; i < stringListRemove.size(); i++) {
            System.out.println(stringListRemove.get(i));
        }


        List<String> stringListSort = new ArrayList<>();
        stringListSort.add("Ihor");
        stringListSort.add("Olga");
        stringListSort.add("Egor");
        stringListSort.add("Anya");
        stringListSort.add("Artem");
        stringListSort.add("1");
        stringListSort.add("243");

        Collections.sort(stringListSort);
        for (String element: stringListSort) {
            System.out.println(element);
        }

        Collections.reverse(stringListSort);
        for (String element: stringListSort) {
            System.out.println(element);
        }
    }
}
