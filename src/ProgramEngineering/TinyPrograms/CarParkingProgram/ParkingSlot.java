package ProgramEngineering.TinyPrograms.CarParkingProgram;

public class ParkingSlot {

    public int row;
    public int col;
    public int level;
    public Car carOccupyingSlot;

//    every ParkingSlot constructor is initialized when having a car parking
    public ParkingSlot(int row, int col, int level) {
        this.row = row;
        this.col = col;
        this.level = level;
    }

//    means the space is occupied by a car -> and the space wasn't now available anymore
    public void park(Car car) {
        this.carOccupyingSlot = car;
    }

    @Override
    public String toString() {
        return "ParkingSlot{" +
                "row=" + row +
                ", col=" + col +
                ", level=" + level +
                ", carOccupyingSlot=" + carOccupyingSlot +
                '}';
    }
}
