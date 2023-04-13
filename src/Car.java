public class Car extends MotorTransport {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void service() {
        System.out.println("Поднимаем машину");
        updateTures();
        checkEngine();
    }

    private void updateTures() {
    }


    @Override
    public void sevice() {

    }
}

