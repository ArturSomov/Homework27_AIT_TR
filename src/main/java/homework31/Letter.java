package homework31;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Letter extends MailItem {

    private boolean isRegistered;

    public Letter(String sender, String recipient, double weight, boolean isRegistered) {
        super(sender, recipient, weight);
        this.isRegistered = isRegistered;
        log.info("Letter created: registered = {}, sender = {}, recipient = {}, weight = {} kg",
                isRegistered, sender, recipient, weight);
    }

    @Override

    public double calculateShippingCost() {
        log.debug("Called the calculateShippingCost() method for letter: registered = {}", isRegistered);
        if (isRegistered) {
            log.debug("Cost of a registered letter: 10.0 euro");
            return 10.0;
        } else {
            log.debug("Cost of unregistered letter: 5.0 euro");
            return 5.0;
        }
    }

    @Override
    public void printDetails() {
        log.debug("The printDetails() method was called for a letter: sender = {}, recipient = {}, registered = {}",
                getSender(), getRecipient(), isRegistered);
        System.out.println("Letter:");
        super.printDetails();
        System.out.println("Registered: " + (isRegistered ? "Yes" : "No"));
        System.out.println("Shipping cost: " + calculateShippingCost() + " euro");
        log.info("Letter details successfully displayed: sender = {}, recipient = {}, registered = {}",
                getSender(), getRecipient(), isRegistered);
    }
}
