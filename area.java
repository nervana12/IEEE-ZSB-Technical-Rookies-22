package ieee;

import java.util.Scanner;

public class area{
    public static void main(String[] args) {
        System.out.println("Enter the length, width of the rectangle:");
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int w = input.nextInt();
        
        System.out.println(l*w);
        System.out.println(2*(l+w));
    }  
}
