import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static int[] printNos(int x) {
        // Write Your Code Here
       if(x==0){
           return new int[0];
       }
       else{
           int[] sa=printNos(x-1);
           int[] na=Arrays.copyOf(sa,sa.length+1);
           na[sa.length]=x;
           return na;

       }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]=new int[n];

        a[n]=printNos(n);
        for(int i=0;i<a.length;i++){

            System.out.println(a[i]);
        }
    }
}
