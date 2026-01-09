import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
      //Initializing ArrayList
        ArrayList<String> list = new ArrayList<>();

      //Adding Elements to list using add() method
        list.add("Java");
        list.add("Python");
        list.add("C++");

      //Printing Elements from list using enhanced for loop
        for (String lang : list) {
            System.out.println(lang);
        }
    }
}
