package racingcar;
import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class RacingEvent {

    private final List<Car> players = new ArrayList<>();
    private int lap = 0;
    private String[] track;

    public RacingEvent(){
    }

    public RacingEvent(Car[] cars){
        addAllCar(cars);
    }

    private String selectWinner(){
        StringBuilder winner = new StringBuilder();
        // 0번: 인덱스, 1번 : 길이
        int[] max = new int[2];
        max[1] = -1;
        for(int i = 0 ; i < players.size() ; i++){
            if(track[i].length() > max[1]){
                max[0] = i;
                max[1] = track[i].length();
            }
        }

        for(int i = max[0] + 1 ; i < players.size() ; i++){
            if(track[i].length() == max[1]){
                winner.append(", ").append(players.get(i))g;
            }
        }

        return winner.toString();
    }

    private void moveCar(){
        int rnd_int;

        for(int i = 0; i < players.size() ; i++){
            rnd_int = Randoms.pickNumberInRange(0, 9);
            if(rnd_int >= 4) {
                track[i] = track[i] + "-";
            }
        }
    }

    private void setTrack() {
        track = new String[players.size()];
    }

    private void printTrack(){
        for(int i = 0 ; i < track.length ; i++){
            System.out.print(players.get(i) + " : ");
            System.out.println(track[i]);
        }
    }

    public void addCarWithString(String input){

        System.out.println("경주할 자동차를 입력 하세요 : ");
        String member_input = Console.readLine();
        member_input = member_input.replace(" ", "");
        String[] player = member_input.split(",");

        for(String car : player){
            addCar(new Car(car));
        }

    }

    public void setLap(){
        System.out.println("시도 횟수를 입력하세요 : ");
        //정규식 계산을 위해 string 타입으로 입력받기
        String lap_input = Console.readLine();
        validLap(lap_input);
        lap = Integer.parseInt(lap_input);
    }

    private void validLap(String input) {
        String regex_lap = "^[1-9][0-9]*$";
        if(!Pattern.matches(regex_lap, input)){
            throw new IllegalArgumentException("유효하지 않은 시도횟수 입니다.");
        }
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
