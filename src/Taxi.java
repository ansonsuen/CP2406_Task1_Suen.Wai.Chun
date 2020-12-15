public class Taxi extends Car {
    private static final int i = 0;
    public Taxi(String id) {
        super("car_" + (i + 1));
        this.id = ("taxi_" + id);
        length = super.getLength() * 2+1;
    }

}

