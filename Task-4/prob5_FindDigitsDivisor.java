import java.io.*;
import java.util.stream.*;

class Result {

    public static int findDigits(int n) {
        int sum=0;
        int n2 = n;
        while (n2 > 0) {
        int x = n2 % 10;
        if (x!=0 && n%x == 0)
            sum++;
        n2 = n2 / 10;
        }
        return sum;
    }

}

public class prob5_FindDigitsDivisor {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result.findDigits(n);

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