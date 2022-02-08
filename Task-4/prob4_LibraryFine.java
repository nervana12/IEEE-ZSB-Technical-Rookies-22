import java.io.*;
import static java.sql.Types.NULL;

class Result {

    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
        if(d1<1 || d2<1 || d1>31 || d2>31 || m1<1 || m2<1 || m1>12 || m2>12 || y1<1 ||y2<1 || y1>3000 || y2>3000)
            return NULL;
        
        if (d1>d2 && y1==y2 && m1==m2)
            return 15*(d1-d2);
        if (y1==y2 && m1>m2)
            return 500*(m1-m2);
        if(y1>y2)
            return 10000;
        return 0;
    }

}

public class prob4_LibraryFine {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d1 = Integer.parseInt(firstMultipleInput[0]);

        int m1 = Integer.parseInt(firstMultipleInput[1]);

        int y1 = Integer.parseInt(firstMultipleInput[2]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int d2 = Integer.parseInt(secondMultipleInput[0]);

        int m2 = Integer.parseInt(secondMultipleInput[1]);

        int y2 = Integer.parseInt(secondMultipleInput[2]);

        int result = Result.libraryFine(d1, m1, y1, d2, m2, y2);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
