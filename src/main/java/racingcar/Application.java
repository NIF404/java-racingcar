package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차를 입력 하세요 : ");
        String member_input = Console.readLine();

        System.out.println("시도 횟수를 입력하세요 : ");
        //정규식 계산을 위해 string 타입으로 입력받기
        String try_input = Console.readLine();

        member_input = member_input.replace(" ", "");

        String regex_player = "^([a-zA-Z]{1,5})(,[a-zA-Z]{1,5}){1,}$";
        String regex_try = "^[1-9][0-9]*$";

        vaildPlayer(member_input, regex_player);
        vaildTry(try_input, regex_try);

        String[] player = member_input.split(",");
        int try_count = Integer.parseInt(try_input);


    }

    private static void vaildTry(String input, String pattern) {
        if(!Pattern.matches(pattern, input)){
            throw new IllegalArgumentException("유효하지 않은 시도횟수 입니다.");
        }
    }

    private static void vaildPlayer(String input, String pattern) {
        if(!Pattern.matches(pattern, input)){
            throw new IllegalArgumentException("유효하지 않은 이름입니다.");
        }
    }
}
