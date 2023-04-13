public abstract class WheeledTransport implements Transport{
    private final String modelName;
    private final int wheelCount;

    protected WheeledTransport(String modelName, int wheelCount) {
        this.modelName = modelName;
        this.wheelCount = wheelCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public abstract void service();

    public abstract void sevice();
}
