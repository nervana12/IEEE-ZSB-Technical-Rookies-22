package ieee;

import java.util.Scanner;

public class prob1_MinDistance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the list: ");
        int l = input.nextInt();
        int[] A = new int[l];
        System.out.println("Enter the elements:");
        for (int i=0;i<l;i++){
            int a = input.nextInt();
            A[i]=a;
        }
        System.out.println(MinDistance(A));
    }
    
    public static int MinDistance(int[] a){
        int min = a.length;
        for (int i=0 ; i<a.length ; i++){
            for (int j=i+1 ; j<a.length-1 ; j++){
                if(a[i] == a[j] && Math.abs(j-i)<min)
                    min = Math.abs(j-i);
            }
        }
        return min;
    }
}
