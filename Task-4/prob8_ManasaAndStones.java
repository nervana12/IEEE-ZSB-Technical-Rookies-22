import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> stones(int n, int a, int b) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        int y = Math.min(a, b);
        int z = Math.max(a, b);
        for(int i=0 ; i<n ; i++){
            int x = (n-(i+1))*y + i*z;
            if(!A.contains(x))
                A.add(x);
        }
        return A;
    }
}

public class prob8_ManasaAndStones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = Integer.parseInt(bufferedReader.readLine().trim());

        for (int TItr = 0; TItr < T; TItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int a = Integer.parseInt(bufferedReader.readLine().trim());

            int b = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> result = Result.stones(n, a, b);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
