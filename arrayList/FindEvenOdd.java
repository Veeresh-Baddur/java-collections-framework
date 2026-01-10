import java.util.ArrayList;

public class FindEvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : list) {
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
