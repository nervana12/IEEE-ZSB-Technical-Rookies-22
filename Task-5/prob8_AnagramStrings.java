package ieee;

import java.io.*;
import java.util.*;

public class prob8_AnagramStrings {
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        List<String> lst = new ArrayList<>();
        for(int i=0 ; i <= 2*cases ; i++){
            String name = s.nextLine();
            lst.add(name);
        }

        for(int i=1 ; i<= cases*2 ; i+=2){
            System.out.println(string(lst.get(i) , lst.get(i+1)));
        }
    }
    
    public static int string(String s , String h) {
        /*
        int k=0;
        for (int i=0 ; i<s.length() ; i++){
            for (int j=0 ; j<h.length() ; j++){
                if(s.charAt(i) != h.charAt(j)){
                    //if(s.charAt(i) != s.charAt(i) && s.charAt(j) != s.charAt(j)){
                        k++;
                }
            }
        }
        */

        char[] s1 = s.toCharArray();
        Arrays.sort(s1);
        char[] s2 = h.toCharArray();
        Arrays.sort(s2);
        int j=0;
        for ( int i=0 ; i<s.length() ; i++){
            if(s1[i] != s2[i]){
                j++;
            }
        }
        return j*2;
    }
}
