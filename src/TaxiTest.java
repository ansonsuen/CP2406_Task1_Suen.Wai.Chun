import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiTest {

    Taxi taxi= new Taxi("0");

    @Test
    void getLength(){assertEquals(3,taxi.getLength());}
    @Test
    void getId() {
        assertEquals("taxi_0", taxi.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, taxi.getSpeed());
        assertEquals(1, taxi.getPosition());
    }
}
