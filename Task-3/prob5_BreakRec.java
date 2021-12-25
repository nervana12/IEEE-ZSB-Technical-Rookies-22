package ieee;

import java.util.Scanner;

public class  prob5_BreakRec{
    public static void main(String[] args) {
        System.out.print("Enter the number of scores: ");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int[] List=new int[l];
        System.out.print("Enter the scores: ");
        for(int i=0; i<List.length; i++){
            int n = input.nextInt();
            List[i]=n;
        }
        List = BreakingRecords(List);
        System.out.println(List[0] +" "+ List[1]);
    }
    public static int[] BreakingRecords(int[] scores) {
        int[] a = new int[2];
        int high=0, low=0, max=scores[0], min=scores[0];
        for(int i=0; i<scores.length; i++){
            if(scores[i]>max){
                max=scores[i];
                high++;
            }
            else if(scores[i]<min){
                min=scores[i];
                low++;
            }
        }
        a[0]=high;   a[1]=low;
        return a;
    }
}