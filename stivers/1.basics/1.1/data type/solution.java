import java.util.Scanner;

public class solution {
    public static int dataTypes(String type) {

        if (type == "Integer")
            return 4;
        else if (type == "Long")
            return 8;
        else if (type == "Float")
            return 4;
        else if (type == "Double")
            return 8;
        else
            return 1;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(dataTypes(s) + " Bytes");

        sc.close(); // Write your code here
    }
}

// NOT COMPLETED