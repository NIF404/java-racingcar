package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;


public class Application {

    public static void main(String[] args) {

        String[] player_location = new String[player.length];
        setPlayer(player, player_location);

        for(int i = 0 ; i < try_count; i++){
            allPlayerMove(player, player_location);
            printLocation(player, player_location);
            System.out.println();
        }

        String winner = selectWiner(player, player_location);

        System.out.print("최종 우승자 : ");
        System.out.println(winner);


    }

    private static String selectWiner(String[] player, String[] location) {
        StringBuilder winner;
        // 0번: 인덱스, 1번 : 길이
        int[] max = new int[2];
        max[1] = -1;
        for(int i = 0 ; i < player.length ; i++){
            if(location[i].length() > max[1]){
                max[0] = i;
                max[1] = location[i].length();
            }
        }

        winner = new StringBuilder(player[max[0]]);

        for(int i = max[0] + 1 ; i < player.length ; i++){
            if(location[i].length() == max[1]){
                winner.append(", ").append(player[i]);
            }
        }

        return winner.toString();

    }

    private static void allPlayerMove(String[] player, String[] location) {

        int rnd_int;

        for(int i = 0; i < player.length ; i++){
            rnd_int = Randoms.pickNumberInRange(0, 9);
            if(rnd_int >= 4) {
                playerMove(location, i);
            }
        }

    }



    private static void setPlayer(String[] player, String[] location){
        for(int i = 0 ; i < player.length ; i++){
            location[i] = "";
        }
    }

    private static void printLocation(String[] player, String[] location){

        for(int i = 0 ; i < player.length ; i++){
            System.out.print(player[i] + " : ");
            System.out.println(location[i]);
        }

    }



    private static void playerMove(String[] location, int index){
        location[index] = location[index] + "-";
    }

}
