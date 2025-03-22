package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        System.out.println("경주할 자동차를 입력 하세요 : ");
        String member_input = Console.readLine();

        System.out.println("시도 횟수를 입력하세요 : ");
        int try_count = Integer.parseInt(Console.readLine());

        member_input = member_input.replace(" ", "");
        String[] player = member_input.split(",");


    }
}
