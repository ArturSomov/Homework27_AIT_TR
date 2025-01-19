package homework31;

public abstract class MailItem {

    private String sender;
    private String recipient;
    private double weight;


    public MailItem(String sender, String recipient, double weight) {

        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 1; // Minimal weight - 1 kg
        }
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double calculateShippingCost();

    public void printDetails() {
        System.out.println("Sender: " + sender);
        System.out.println("Recipient: " + recipient);
        System.out.println("Weight: " + weight + " kg");
    }
}
