import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char s = sc.next().charAt(0);

        if ((s >= 'A' && s <= 'Z'))
            System.out.println("1");
        else if (s >= 'a' && s <= 'z')
            System.out.println("0");
        else
            System.out.println("-1");

        sc.close();
    }
}