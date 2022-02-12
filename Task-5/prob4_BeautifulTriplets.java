import java.io.*;

class Result {

    public static int beautifulTriplets(int d, int[] arr) {
        int count = 0 ;
        for (int i=0; i<arr.length; i++){
            int k=i , num=0;
            for (int j=i+1; j<arr.length; j++){
                if(arr[j]-arr[k] == d){
                    num++;
                    k=j;
                    if(num==2){
                        count++;
                        num=0;
                        j=arr.length;
                    }
                }
            }
        }
        return count;
    }
}

public class prob4_BeautifulTriplets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int d = Integer.parseInt(firstMultipleInput[1]);

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr[i] = arrItem;
        }

        int result = Result.beautifulTriplets(d, arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
