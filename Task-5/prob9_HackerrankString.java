import java.io.*;

class Result {

    public static String hackerrankInString(String s) {
        String h = "hackerrank";
        
        //if (s.length() < h.length())    return "NO";
        
        int j=0;
        for ( int i=0 ; i<s.length() ; i++){
            if(s.charAt(i) == h.charAt(j)){
                j++;
            }
            if(j>=h.length())
                return "YES";
        }
            return "NO";
    }

}

public class prob9_HackerrankString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            String result = Result.hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
