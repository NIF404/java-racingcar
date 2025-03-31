package racingcar;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

import java.util.regex.Pattern;


public class Application {

    public static void main(String[] args) {

        RacingEvent RE1 = new RacingEvent();
        RE1.addCarWithString();
        RE1.racing();

    }


}
