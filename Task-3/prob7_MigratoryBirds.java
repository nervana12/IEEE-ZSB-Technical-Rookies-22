package ieee;

import java.util.Scanner;

public class prob7_MigratoryBirds {
    public static void main(String[] args){
        System.out.println("Enter the number of birds: ");
        Scanner input = new Scanner(System.in); 
        int l = input.nextInt();
        System.out.println("Enter the bird sightings: ");
        int[] arr= new int[l];
        for(int j=0; j<l; j++)
            arr[j]=input.nextInt();
        System.out.println(MigratoryBirds(arr));
    }
    public static int MigratoryBirds(int[] arr) {
        int[] a={0,0,0,0,0};
        for(int i=0; i<arr.length; i++){
            a[arr[i]-1]++;
        }
        int max=a[0], id=0;
        for(int j=0; j<5; j++){
            if (a[j]>max && a[j]!= max){
                max=a[j];
                id=j;
            }
        }
        return id+1;
    }
}
