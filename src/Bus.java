public class Bus extends Car {
    private static final int i = 0;

    public Bus(String id, int i) {
        super("car_" + (i + 1));
        this.id = ("bus_" + id);
        length = super.getLength() * 3;
    }

}
