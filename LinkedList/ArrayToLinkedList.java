import java.util.LinkedList;
import java.util.Arrays;


public class ArrayToLinkedList {
    public static void main(String[] args) {
        Integer[] arr = {10, 20, 30};

        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(arr));
        System.out.println(list);
    }
}
