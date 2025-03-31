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









}
