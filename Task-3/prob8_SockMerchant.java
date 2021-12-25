package ieee;

import java.util.*;

public class  prob8_SockMerchant {
    public static void main(String[] args){
        System.out.println("Enter the number of socks in the pile: ");
        Scanner input = new Scanner(System.in); 
        int l = input.nextInt();
        System.out.println("Enter the colors of each sock: ");
        int[] arr= new int[l];
        for(int j=0; j<l; j++)
            arr[j]=input.nextInt();
        System.out.println(SockMerchant(l,arr));
    }
    public static int SockMerchant(int l, int[] arr) {
        HashSet<Integer> set = new HashSet<Integer>();
        int count=0;
        for(int i=0; i<l; i++){
            int element = arr[i];
            if(set.contains(element)) {
                set.remove(element);
            count++;
            } else {
                set.add(element);
            }    
        }
        return count;
    }
}
