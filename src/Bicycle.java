public class Bicycle extends WheeledTransport {

    public Bicycle(String modelName, int wheelCount) {
        super(modelName, wheelCount);
    }

    @Override
    public void service() {
        System.out.println("Переворачиваем велосипед");
        updateTyre();
    }

    @Override
    public void sevice() {

    }
}
