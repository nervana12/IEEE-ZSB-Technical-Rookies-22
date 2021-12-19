package ieee;

import java.util.Scanner;

public class  wordInFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        String[] words = text.split(text);
        //int square = 10;
        int square = words.length;
        if (square > 0) {
            int index = 0;
            for (int i = 0; i < square; i++) {
                for (int j = 0; j < square; j++) {
                    if (i == 0 || j == 0 || i == square - 1 || j == square - 1)
                        System.out.print("*");
                    else {
                        if (index < words.length && index < square * square)
                            System.out.print(words[index++]);
                        else {
                            System.out.print(" ");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
