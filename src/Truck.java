public class Truck extends MotorTransport {


    public Truck(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void service() {

    }


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }


    @Override
    public void sevice() {
        System.out.println("Отцупляем прицеп");
        updateTyre();
        checkEngine();
        checkTrailer();

    }
}


