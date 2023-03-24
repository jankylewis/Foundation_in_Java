package ProgramEngineering.TinyPrograms.CarParkingProgram;

public class Car {

//    this program is derived from a lesson: https://www.youtube.com/watch?v=1CxveNbUFd0

    public String licenseNumber;

    public Car(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "licenseNumber='" + licenseNumber + '\'' +
                '}';
    }
}
