import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> acmTeam(List<String> topic) {
        int[][] a = new int[topic.size()][topic.get(0).length()];
        for(int i=0 ; i<topic.size() ; i++){
            for (int j=0; j<topic.get(0).length(); j++) {
                a[i][j] = (int) topic.get(i).charAt(j);      //49 --> 1  & 48 --> 0
            }
        }

        List<Integer> k = new ArrayList<>();
        int team=0;
        for(int i=0 ; i<topic.size()-1 ; i++){
            int x = i;
            team = 0;
            while( x < topic.size()-1){
                x++;
                for (int j=0; j<topic.get(0).length(); j++) {
                    if ( a[i][j] == 49 || a[x][j] == 49){
                        team ++;
                    }
                    if( j==topic.get(0).length()-1){
                        k.add(team);
                        team = 0;    
                    }
                }
            }
        }
        //System.out.println(k);
        
        int max=0 , count=0 ; 
        for ( int i=0 ; i<k.size() ; i++){
            if( k.get(i) > max){
                max = k.get(i);
            }
        }
        for ( int i=0 ; i<k.size() ; i++){
            if(k.get(i) == max){
                count++;
            }
        }


        List<Integer> m = new ArrayList<>();
        m.add(max);
        m.add(count);
        return m;
    }

}

public class prob7_ACM_Team {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<String> topic = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String topicItem = bufferedReader.readLine();
            topic.add(topicItem);
        }

        List<Integer> result = Result.acmTeam(topic);

        for (int i = 0; i < result.size(); i++) {
            bufferedWriter.write(String.valueOf(result.get(i)));

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
