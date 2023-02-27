package collections;
import java.util.*;
public class ListExample {

    String[] array = {"Ion", "Vasile"}; // 1. nu putem extinde marimea dinamic
    String[] array2 = new String[50]; // 1. nu putem extinde marimea dinamic

    List<String> listString = new ArrayList<>(); // dynamic allocation of memory
    // String[10], String[20], String[40]

    List<Integer> listInt = new ArrayList<>();

    public void traverseList() {

        int age = 113;
        double pret;

        Integer integer = new Integer(2);

        array[0] = "Ion";
        array[1] = "Vasile";
       // array.length // 50

       listString.add("Ion");  // 10 elemente
//       listString.add("Vasile"); // la ultimul index // array[1]
       listString.add("Vasile"); // la ultimul index // array[1]

        listString.size(); // 2

       String indexOne = listString.get(1);

       listInt.add(80);
       listInt.add(50);
       listInt.add(60);

       Integer num = listInt.get(0); // 50

        for (int i = 0; i < listInt.size(); i++) {
            System.out.println(listInt.get(i));
        }

        for(String x : listString) {
            System.out.println("Nume: "  + x);
        }

        for(Integer x : listInt) {
            // 1. x = 50
            // 2. x = 60
            System.out.println(x);
        }

        listInt.remove(1);
        listInt.size(); // 1

        listInt.remove(50);

        listString.remove("Vasile");

        boolean contains = listString.contains("Vasile"); // true || false

        List<String> secondList = new ArrayList<>();
        secondList.addAll(listString);

        secondList.add("Gheorghe");

        listString.clear();
        listString.size(); // 0

        boolean containsAll = secondList.containsAll(listString); // true

        secondList.removeAll(listString);

        Object[] oldArray =  secondList.toArray();


    }
}
