package racingcar;

import java.util.regex.Pattern;

public class Car {

    public final String name;
    private int speed;

    public Car(String name){
        validName(name);
        this.name = name;
        this.speed = 1;
    }

    public Car(String name, int speed){
        validName(name);
        this.name = name;
        this.speed = speed;
    }


    public void setSpeed(int n){
        this.speed = n;
    }

    public int getSpeed(){
        return speed;
    }

    private static void validName(String input) {
        String regex_name = "^([a-zA-Z]{1,5})$";
        input = input.replace(" ", "");
        if(!Pattern.matches(regex_name, input)){
            throw new IllegalArgumentException("유효하지 않은 이름입니다.");
        }
    }

}
