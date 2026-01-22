import java.util.HashSet;
import java.util.Scanner;

public class UnionArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashSet<Integer> set = new HashSet<>();
    int arr1 = sc.nextInt();
    for(int i = 0; i < arr1; i++){
      set.add(sc.nextInt());
    }

    int arr2 = sc.nextInt();
    for(int i = 0; i < arr2; i++) {
      set.add(sc.nextInt());
    }

    for(int element : set) {
      System.out.print(element + " ");
    }

  }
}
