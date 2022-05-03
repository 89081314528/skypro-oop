import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle1", 2);

        ServiceStation station = new ServiceStation();
        List<Machine> machines = List.of(bicycle1, bicycle2, car1, car2, truck1, truck2);
        for (Machine machine : machines) {
            station.check(machine);
        }
    }
}
