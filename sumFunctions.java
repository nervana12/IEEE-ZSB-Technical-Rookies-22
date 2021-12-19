package ieee;

import java.util.Scanner;

public class  sumFunctions {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int[] a = new int[l];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<l ; i++){
            a[i]=input.nextInt();
        } 
        sum1(a);
        sum2(a);
        System.out.println(sum3(a,a.length));
    }
    public static void sum1(int[] a) {
        int sum=0;
        for (int i=0 ; i<a.length ; i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
    public static void sum2(int[] a) {
        int sum=0, n=0;
        while (n<a.length){
            sum+=a[n];
            n++;
        }
        System.out.println(sum);
    }
    public static int sum3(int[] a, int b) {
        if (b<=0)
            return 0;
        return sum3(a, b-1) + a[b-1];
    }
}
