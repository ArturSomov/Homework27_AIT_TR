package homework31;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Advertisement extends MailItem {

    private int quantity;

    public Advertisement (String sender, String recipient, double weight, int quantity) {

        super(sender, recipient, weight);

        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 1; // Minimal quantity - 1
        }

        log.info("Advertising leaflet is created: sender = {}, recipient = {}, weight = {}, quantity = {}",
                sender, recipient, weight, this.quantity);
    }

    @Override
    public double calculateShippingCost() {
        log.debug("Called calculateShippingCost() method for advertising leaflet: quantity = {}", quantity);
        return Math.ceil(quantity / 50.0); // Rounding a numeral up to the nearest integer value with help of method Math.ceil
    }

    @Override
    public void printDetails() {
        log.debug("Called printDetails() method for advertising leaflet: sender = {}, recipient = {}, quantity = {}",
                getSender(), getRecipient(), quantity);
        System.out.println("Advertising leaflet:");
        super.printDetails();
        System.out.println("Amount of copies: " + quantity);
        System.out.println("Shipping cost: " + calculateShippingCost() + " euro");
        log.info("Details of advertising leaflet have been successfully displayed: sender = {}, recipient = {}, quantity = {}",
                getSender(), getRecipient(), quantity);
    }
}
