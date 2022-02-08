import java.io.*;
import java.util.stream.*;

class Result {
    public static int chocolateFeast(int n, int c, int m) {
            int sum = n/c;
            int wrp = sum;
            while(wrp >= m){
                int a = wrp/m;
                wrp = (wrp - m*a) + a;
                sum += a;
            }
            return sum;
    }

}
public class prob6_ChocoFeast {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int c = Integer.parseInt(firstMultipleInput[1]);

                int m = Integer.parseInt(firstMultipleInput[2]);

                int result = Result.chocolateFeast(n, c, m);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        bufferedWriter.close();
    }
}
