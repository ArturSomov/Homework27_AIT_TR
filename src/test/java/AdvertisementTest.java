import homework31.Advertisement;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdvertisementTest {

    @Test
    public void testCalculateShippingCostForExactBatch() {
        Advertisement advertisement = new Advertisement("Sender", "Recipient", 0.1, 100);
        assertEquals(2.0, advertisement.calculateShippingCost());
    }

    @Test
    public void testCalculateShippingCostForIncompleteBatch() {
        Advertisement advertisement = new Advertisement("Sender", "Recipient", 0.1, 101);
        assertEquals(3.0, advertisement.calculateShippingCost());
    }

    @Test
    public void testCalculateShippingCostForOneLeaflet() {
        Advertisement advertisement = new Advertisement("Sender", "Recipient", 0.1, 1);
        assertEquals(1.0, advertisement.calculateShippingCost());
    }

    @Test
    public void testPrintDetails() {

        Advertisement advertisement = new Advertisement("Sender", "Recipient", 0.1, 50);
        advertisement.printDetails();

    }
}
