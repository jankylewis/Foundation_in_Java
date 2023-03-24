package ProgramEngineering.TinyPrograms.CarParkingProgram;

import java.util.LinkedList;
import java.util.List;

public class Level {

    public int levelNumber;
    public int rows;
    public List<ParkingSlot> takenSlots;
    public int SLOTS_PER_ROW = 2;

    public Level(int rows, int levelNumber) {
        this.levelNumber = levelNumber;
        this.rows = rows;
        this.takenSlots = new LinkedList<>();
    }

    //    return a parking slot
    public ParkingSlot findAvailableSpot() {
        int totalNumberSlots = rows * SLOTS_PER_ROW;
        if (takenSlots.size() >= totalNumberSlots) {
//            if all the slots have been taken
            return null;
        } else if (takenSlots.isEmpty()) {
//            if there has been no car parked -> park at the first slot
            return new ParkingSlot(0, 0, levelNumber);
        } else {
            ParkingSlot lastSpaceOccupied = takenSlots.get(takenSlots.size() - 1);
            if (lastSpaceOccupied.col < SLOTS_PER_ROW) {
                return new ParkingSlot(lastSpaceOccupied.row, lastSpaceOccupied.col + 1, levelNumber);
            } else {
                return new ParkingSlot(lastSpaceOccupied.row + 1, 0, levelNumber);
            }
        }
    }

    //    indicate whether being able to park or not
//    try to find a free space in the level using the findAvailableSpot method
//    if it finds one, it will put the car in that space
//    and return true -> or vice versa -> return false
    public boolean park(Car car) {
        ParkingSlot freeSpace = findAvailableSpot();
        if (freeSpace == null) {
//            no space in the level
            return false;
        } else {
//            park in free space
            freeSpace.park(car);
            takenSlots.add(freeSpace);
            return true;
        }
    }

    @Override
    public String toString() {
        return "Level{" +
                "levelNumber=" + levelNumber +
                ", rows=" + rows +
                ", takenSlots=" + takenSlots +
                ", SLOTS_PER_ROW=" + SLOTS_PER_ROW +
                '}';
    }
}
