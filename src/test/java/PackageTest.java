import homework31.Package;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class PackageTest {

        @Test
        public void testCalculateShippingCost() {

            Package packageItem = new Package("Sender", "Recipient", 3.0, 30.0, 20.0, 15.0);
            assertEquals(6.0, packageItem.calculateShippingCost(), "The cost should be 2 euro for each kg");
        }

        @Test
        public void testMinimumWeight() {

            Package packageItem = new Package("Sender", "Recipient", 0.0, 30.0, 20.0, 15.0);
            assertEquals(2.0, packageItem.calculateShippingCost(), "For a minimum weight of 1 kg the cost should be 2 euro");
        }

        @Test
        public void testMinimumDimensions() {

            Package packageItem = new Package("Sender", "Recipient", 2.0, -5.0, -10.0, -20.0);
            packageItem.printDetails();
            assertEquals(10.0, packageItem.getLength(), "The length should be at least 10 cm");
            assertEquals(10.0, packageItem.getWidth(), "The width should be at least 10 cm");
            assertEquals(10.0, packageItem.getHeight(), "The height should be at least 10 cm");
        }

        @Test
        public void testPositiveDimensions() {
            // Тест: корректная установка размеров.
            Package packageItem = new Package("Sender", "Recipient", 5.0, 50.0, 40.0, 30.0);
            assertEquals(50.0, packageItem.getLength(), "The length should be equal to 50 cm");
            assertEquals(40.0, packageItem.getWidth(), "The width should be equal to 40 cm");
            assertEquals(30.0, packageItem.getHeight(), "The height should be equal to 30 cm");
        }

        @Test
        public void testPrintDetails() {

            Package packageItem = new Package("Sender", "Recipient", 2.0, 30.0, 20.0, 15.0);
            packageItem.printDetails();
        }
    }
