package ieee;

import java.util.Scanner;

public class problem_1_palindrome {
    public static void main (String[] args) {
        int x=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string:");
        String a = input.nextLine();
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i) == a.charAt(a.length()-1-i))
                x=1;
            else x=2;
        }
        if (x==1) System.out.println("yes");
        else if(x==2) System.out.println("no");
        
    }
}