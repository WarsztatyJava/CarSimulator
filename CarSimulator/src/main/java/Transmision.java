import java.util.Map;

public class Transmision implements GearChange {

    private Map<Integer, Double> gears;

    private int currentGear;

    public Transmision(Map<Integer, Double> gears) {
        this.gears = gears;
    }


//zaimplementowac metody zmiany biegow

    @Override
    public int currentGear() {
        return gears.get();
    }

    @Override
    public void gearDown() {
        currentGear = currentGear - 1;
    }

    @Override
    public void gearUp() {
        currentGear = currentGear + 1;
    }
}