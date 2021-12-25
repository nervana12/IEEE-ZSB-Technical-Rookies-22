package ieee;

import java.util.Scanner;

public class prob2_Between2Sets{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the two arrays: ");
        int n = input.nextInt();
        int m = input.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[m];
        System.out.println("Enter the elements of first array: ");
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt(); 
        }
        System.out.println("Enter the elements of second array: ");
        for (int i = 0; i < m; i++){
            brr[i] = input.nextInt(); 
        }
        sort(arr);
        sort(brr);
        System.out.println(GetTotalX(arr,brr));
    }
    
    public static int GetTotalX(int[] arr, int[] brr) {
        int i=arr[0] , count=0;
        while(i<=brr[brr.length-1]){
            boolean c=true;
            for (int j=0 ; j<arr.length ; j++){
                if(i%arr[j]!=0){
                    c=false;
                    break;
                }
            }
            if(c==true){
                for(int k=0 ; k<brr.length ; k++){
                        if(brr[k]%i!=0){
                            c=false;
                            break;
                        }
                }
            }
            if(c==true) count++;
            i++;
        }
        return count;
    }
    
    static void sort(int A[]){
	for (int i = 1; i < A.length; ++i) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
	}
    }
}
