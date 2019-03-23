import java.util.List;

public class Car implements Driveable {

    private Engine engine;
    private List<Wheel> wheels;
    private Transmision transmision;
    public Car(Engine engine, List<Wheel> wheels, Transmision transmision) {
        this.engine = engine;
        this.wheels = wheels;
        this.transmision = transmision;

    }

    @Override
    public void drive(int distance) {
        System.out.println("Car drove"+distance);

    }
}