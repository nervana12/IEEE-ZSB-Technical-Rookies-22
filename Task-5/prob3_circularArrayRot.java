package ieee;

import java.util.Scanner;

public class prob3_circularArrayRot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();      //the number of elements in the integer array
        int k = input.nextInt();      //the rotation count
        int q = input.nextInt();      //the number of queries
        
        int[] a = new int[n];
        for (int i=0; i<n ; i++){
            a[i] = input.nextInt();
        }
        
        int[] queries = new int[q];
        for (int i=0; i<q ; i++){
            queries[i] = input.nextInt();
        }
        
        queries = circularArrayRotation(a, k, queries);
        for(int i=0; i<queries.length ; i++){
            System.out.println(queries[i]);
        } 
    }
    
    public static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int[] b = new int[a.length];
        for(int i=0; i<k ; i++){
            Rotate(a,b);
        }
        for(int i=0; i<queries.length ; i++){
            queries[i] = b[queries[i]];
        }
        return queries;
    }
    
    public static void Rotate(int[] a, int[] b) {
        b[0]=a[a.length-1];
        for (int j=1; j<b.length ; j++){
            b[j]=a[j-1];
        }
        for (int j=0; j<b.length ; j++){
            a[j]=b[j];
        }
    }
}
