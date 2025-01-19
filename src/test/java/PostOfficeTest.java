import homework31.Advertisement;
import homework31.Letter;
import homework31.MailItem;
import homework31.PostOffice;
import homework31.Package;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostOfficeTest {

    @Test
    public void testAddMailItem() {

        PostOffice postOffice = new PostOffice();

        Letter letter = new Letter("Sender1", "Recipient1", 0.05, true);

        postOffice.addMailItem(letter);

        assertEquals(1, postOffice.getMailItems().size(), "The list must contain 1 element");
        assertEquals(letter, postOffice.getMailItems().get(0), "The letter should be the first item on the list");
    }

    @Test
    public void testCalculateTotalShippingCost() {

        PostOffice postOffice = new PostOffice();

        postOffice.addMailItem(new Letter("Sender1", "Recipient1", 0.05, true));
        postOffice.addMailItem(new Package("Sender2", "Recipient2", 2.5, 30.0, 20.0, 15.0));
        postOffice.addMailItem(new Advertisement("Sender3", "Recipient3", 0.1, 100));
        double totalCost = 0;
        for (MailItem item : postOffice.getMailItems()) {
            totalCost += item.calculateShippingCost();
        }

        assertEquals(17.0, totalCost, 0.01, "The total shipping cost should be 17 euro");
    }

    @Test
    public void testPrintAllDetails() {

        PostOffice postOffice = new PostOffice();

        postOffice.addMailItem(new Letter("Sender1", "Recipient1", 0.05, true));
        postOffice.addMailItem(new Package("Sender2", "Recipient2", 2.5, 30.0, 20.0, 15.0));
        postOffice.addMailItem(new Advertisement("Sender3", "Recipient3", 0.1, 100));

        postOffice.printAllDetails();

    }

    @Test
    public void testEmptyPostOffice() {

        PostOffice postOffice = new PostOffice();

        assertEquals(0, postOffice.getMailItems().size(), "The list must be empty");

        postOffice.calculateTotalShippingCost();

        postOffice.printAllDetails();
    }
}
