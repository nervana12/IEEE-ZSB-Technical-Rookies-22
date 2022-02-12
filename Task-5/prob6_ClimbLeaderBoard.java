import java.io.*;
import java.util.*;

class Result {

    public static List<Integer> climbingLeaderboard(int[] ranked, int[] player) {
        
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        if(ranked.length == 1)     a.add(ranked[0]);
        else{
            for (int i = 0; i < ranked.length-1; i++) {
                if(ranked[i] > ranked[i+1]){
                    a.add(ranked[i]);    
                }
            }if(ranked[ranked.length-2] != ranked[ranked.length-1])
                a.add(ranked[ranked.length-1]);
        }
        // System.out.println("a=  " + a);
        for (int i = 0; i < player.length; i++) {
            for (int j = a.size()-1 ; j >= 0 ; j--) {
                if (player[i] > a.get(0)){
                    b.add ( 1 );
                    break;
                }
                if (player[i] < a.get(j)){
                    b.add ( j+2 );
                    break;
                }else if(player[i] == a.get(j)){
                    b.add ( j+1 );
                    break;
                }
            } 
        }
        return b;
    }
}

public class prob6_ClimbLeaderBoard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] rankedTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int[] ranked = new int[rankedCount];

        for (int i = 0; i < rankedCount; i++) {
            int rankedItem = Integer.parseInt(rankedTemp[i]);
            ranked[i] = rankedItem;
        }

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        String[] playerTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int[] player = new int[playerCount];

        for (int i = 0; i < playerCount; i++) {
            int playerItem = Integer.parseInt(playerTemp[i]);
            player[i] = playerItem;
        }

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

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
