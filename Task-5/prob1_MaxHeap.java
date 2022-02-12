package ieee;

import java.util.Scanner;

public class prob1_MaxHeap{
    public static void main(String[] args){
        System.out.println("Enter the number of elements: ");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int[] a = new int[length];
        System.out.println("Enter the numbers: ");
        for (int i=0 ; i<length ; i++){
            a[i] = input.nextInt();
        }
        a = MaxHeap(a, a[length-1]);
        for (int i=0 ; i<length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    
    static int[] MaxHeap(int[] A, int i) {
        int l = 2*i+1 , r = 2*i+2 , largest;     //array starts index with 0
        if(l<=A.length && A[l]>A[i]){
            largest = l;
        }else
            largest=i;
        if(r<=A.length && A[r]>A[largest]){
            largest = r;
        }
        if (largest != i){
            int tmp = A[largest];
            A[largest]=A[i];
            A[i]=tmp;
            MaxHeap(A, A[largest]);
        }
        return A;
    }
}
