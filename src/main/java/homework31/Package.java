package homework31;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Package extends MailItem {

    private double length;
    private double width;
    private double height;

    public Package(String sender, String recipient, double weight, double length, double width, double height) {

        super(sender, recipient, weight);

        if (length > 0) {
            this.length = length;
        } else {
            this.length = 10; // Minimal length - 10 cm.
        }

        if (width > 0) {
            this.width = width;
        } else {
            this.width = 10; // Minimal width - 10 cm.
        }

        if (height > 0) {
            this.height = height;
        } else {
            this.height = 10; // Minimal height - 10 cm.
        }

        log.info("Package created: sender = {}, recipient = {}, weight = {}, dimensions = {}x{}x{} cm",
                sender, recipient, weight, this.length, this.width, this.height);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateShippingCost() {
        log.debug("Called the calculateShippingCost() method for package: weight = {}", getWeight());
        return getWeight() * 2.0;
    }

    @Override
    public void printDetails() {
        log.debug("Called the printDetails() method for package: sender = {}, recipient = {}, weight = {}, dimensions = {}x{}x{}",
                getSender(), getRecipient(), getWeight(), length, width, height);
        System.out.println("Package:");
        super.printDetails();
        System.out.println("Dimensions: " + length + "x" + width + "x" + height + " cm");
        System.out.println("Shipping cost: " + calculateShippingCost() + " euro");
        log.info("Package details have been successfully displayed");
    }
}
