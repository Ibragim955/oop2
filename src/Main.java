public class Main {
    public static void main(String[] args) {

        Transport[] transports = new Transport[]{
                new Car("Car1", 4),
                new Car("Car2", 4),
                new Truck("Truck1", 8),
                new Truck("Truck2", 6),
                new Bicycle("Bicucle1", 2),
                new Bicycle("Bicycle2", 3)
        };
        ServiceStation station = new ServiceStation();
        for(Transport transport : transports){
            station.check(transport);

            //
        }
    }
}


