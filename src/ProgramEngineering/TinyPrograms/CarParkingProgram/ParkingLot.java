package ProgramEngineering.TinyPrograms.CarParkingProgram;

import java.util.List;

public class ParkingLot {

    public List<Level> levels;

    public ParkingLot(List<Level> levels) {
        this.levels = levels;
    }

//    indicate if the program is able to park the car in any of the level
//    park method is gonna go through each level an try to park the car
//    if the first level is available and the car can park -> return true
//    otherwise, it will try with the next level. If all levels do not have any space -> return false
    public boolean park(Car car) {
        for (Level level : levels) {
            if (level.park(car)) {
//                start with the first level -> then increase gradually
                return true;
            } else {
//                if the first level does not have any spot to park -> continue the iteration with
//                the next level
                continue;
            }
//            if the program goes to the end -> means it will park the car -> return false
        }
        return false;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "levels=" + levels +
                '}';
    }
}
