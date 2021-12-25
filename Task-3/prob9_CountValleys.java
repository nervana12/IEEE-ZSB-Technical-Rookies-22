package ieee;

import java.util.*;

public class  prob9_CountValleys {
    public static void main(String[] args){
        System.out.println("Enter the number of steps: ");
        Scanner input = new Scanner(System.in); 
        int l = input.nextInt();
        System.out.println("Describe the path string: ");
        String path = input.next();
        System.out.println(CountValleys(l,path));
    }
    public static int CountValleys(int l, String path) {
        int valleys=0, sum=5, n=0;
        char[] a=path.toCharArray();
        for (char c:a){
            if(c=='U') {
                n=1;
            }
            else if(c=='D')
                n=-1;
            sum=sum+n;
            if (sum==5 && c=='U')
                valleys++;
        }
        return valleys;
    }
}
