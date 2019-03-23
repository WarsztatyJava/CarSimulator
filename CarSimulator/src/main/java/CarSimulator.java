import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CarSimulator {

    public static void main(String[] args) {
        Map<Integer,Double> gears = new HashMap<Integer, Double>();
        gears.put(1, 0.356d);
        gears.put(2, 0.4);
        gears.put(3, 0.5);
        gears.put(4, 0.6);
        gears.put(0, 0.0);

        Transmision transmision = new Transmision(gears);
        Engine engine = new Engine("2.0 tdi", FuelType.DIESEL, 100);
        List<Wheel> wheels = new ArrayList<Wheel>();
        Wheel wheel = new Wheel(17, 0.1);
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);
        wheels.add(wheel);


        Car car1 = new Car(engine, wheels,transmision);

    }

}
