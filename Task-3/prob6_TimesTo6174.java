package ieee;
import java.util.Scanner;
public class  prob6_TimesTo6174{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int times=0;
        while(num!=6174){
        int n,r=0,asc=0;
        int x=String.valueOf(num).length(); //no of digits
        if (x<4)    num=num*(int)(Math.pow(10,(4-x)));
        
        int desc = 0;
        for (int i = 9; i >= 0; i--) {
            int tmp = num;
            while (tmp > 0) {
                int digit = tmp % 10;
                // Check for the greatest digit in the given number
                if (digit == i) {
                    desc *= 10;
                    desc += digit;
                }
                tmp /= 10;
            }
        }
        n=desc;
        while(n>0) {
            r=n%10;
            n=n/10;
            asc=(asc*10)+r;
        }
        num=desc-asc;
        times++;
        }
        System.out.println(times);
    }
}