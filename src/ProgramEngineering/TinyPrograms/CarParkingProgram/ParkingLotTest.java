package ProgramEngineering.TinyPrograms.CarParkingProgram;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ParkingLotTest {

    @Test
    public void test_01() {
        System.out.println("Begin Parking Lot program");

        List<Level> levels = List.of(new Level(2, 0), new Level(2, 1));

        ParkingLot parkingLot = new ParkingLot(levels);

        assertTrue(parkingLot.park(new Car("L123")));
        assertTrue(parkingLot.park(new Car("L124")));
        assertTrue(parkingLot.park(new Car("L125")));
        assertTrue(parkingLot.park(new Car("L126")));

        System.out.println(parkingLot);

        assertTrue(parkingLot.park(new Car("L127")));
        assertTrue(parkingLot.park(new Car("L128")));
        assertTrue(parkingLot.park(new Car("L129")));
        assertTrue(parkingLot.park(new Car("L130")));

        System.out.println(parkingLot);

        assertFalse(parkingLot.park(new Car("L131")));



    }

}