import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word1: ");
        String word1 = sc.next();

        System.out.print("Enter word2: ");
        String word2 = sc.next();

        char[] a = word1.toLowerCase().toCharArray();
        char[] b = word2.toLowerCase().toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b) ? "Anagram" : "Not Anagram");
    }
}