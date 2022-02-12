package ieee;

import java.util.Scanner;

public class  prob2_BookReading {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        int[] a = new int[n];
        for (int i=0 ; i<n ; i++){
            a[i] = input.nextInt();
        }
        int x=0 , count=0;
        while(x<t){
            x += 86400-a[count];
            count++; 
        }
        System.out.println(count);
    }
}
