import java.util.ArrayList;

public class ReverseStringsInList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("code");

        ArrayList<String> reversed = new ArrayList<>();

        for (String s : list) {
            String rev = "";
            for (int i = s.length() - 1; i >= 0; i--) {
                rev += s.charAt(i);
            }
            reversed.add(rev);
        }

        System.out.println(reversed);
    }
}
