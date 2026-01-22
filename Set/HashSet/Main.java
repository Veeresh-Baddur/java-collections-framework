import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i = 0; i < n; i++) {
          set.add(sc.nextInt();
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println(longest);
    }
}
