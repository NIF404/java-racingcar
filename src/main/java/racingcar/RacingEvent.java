package racingcar;
import java.util.ArrayList;
import java.util.List;

public class RacingEvent {

    private final List<Car> players = new ArrayList<>();


    public RacingEvent(){
    }

    public RacingEvent(Car[] cars){
        addAllCar(cars);
    }



    public void addCar(Car car){
        if(players.contains(car)){
            System.out.println("이미 참여한 자동차 입니다.");
        }
        else players.add(car);
    }

    public void addAllCar(Car[] cars){
        for(Car car : cars){
            if(!players.contains(car)){
                players.add(car);
            }
        }

        System.out.println("이미 참여한 자동차를 제외한 나머지를 추가했습니다");
    }

    public void removeCar(Car car){
        if(!players.contains(car)){
            System.out.println("참여하지 않은 자동차 입니다.");
        }
        players.remove(car);
    }

}
