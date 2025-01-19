import homework31.Letter;
import homework31.MailItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LetterTest {

    @Test
    public void testCalculateShippingCostForRegisteredLetter() {
        Letter letter = new Letter("Sender", "Recipient", 0.05, true);
        assertEquals(10.0, letter.calculateShippingCost(), "The cost of a registered letter should be 10 euro");
    }

    @Test
    public void testCalculateShippingCostForUnregisteredLetter() {
        Letter letter = new Letter("Sender", "Recipient", 0.05, false);
        assertEquals(5.0, letter.calculateShippingCost(), "The cost of an unregistered letter should be 5 euro");
    }

    @Test
    public void testPrintDetails() {
        Letter letter = new Letter("Sender", "Recipient", 0.05, true);
        letter.printDetails();
    }

    @Test
    public void testGetSenderAndRecipient() {
        // Using subclass to test getters
        MailItem letter = new Letter("John Doe", "Jane Smith", 0.05, true);


        assertEquals("John Doe", letter.getSender(), "Sender must be 'John Doe'");


        assertEquals("Jane Smith", letter.getRecipient(), "Recipient must be 'Jane Smith'");
    }
}
