package ieee;

import java.util.Scanner;

public class prob10_PageCount {
    public static void main(String[] args){
        System.out.println("Enter the number of pages: ");
        Scanner input = new Scanner(System.in); 
        int n = input.nextInt();
        System.out.println("Enter the number of required page: ");
        int p = input.nextInt();
        System.out.println(PageCount(n,p));
    }
    public static int PageCount(int n, int p) {
        int front = p/2, back = (n/2)-front;
        return Math.min(front,back);
    }
}
