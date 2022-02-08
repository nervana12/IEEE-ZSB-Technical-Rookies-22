import java.util.*;

public class prob9_CavityMap{
    public static void main(String ar[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt(),i,j;
        char c[][]=new char[n][];
        for(i=0;i<n;i++){
            c[i]=input.next().toCharArray();
        }
        for(i=1;i<n-1;i++){
            for(j=1;j<n-1;j++){
                if(c[i][j]>c[i][j-1] && c[i][j]>c[i][j+1] && c[i][j]>c[i-1][j] && c[i][j]>c[i+1][j])
                    c[i][j]='X';
            }
        }
        for(i=0;i<n;i++)
            System.out.println(new String(c[i]));
    }
}