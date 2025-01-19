package homework31;

public class Main {

    public static void main(String[] args) {

        PostOffice postOffice = new PostOffice();

        MailItem letter = new Letter("Leonardo DiCaprio", "Brad Pitt", 0.05, true);
        MailItem packageItem = new Package("Scarlett Johansson", "Chris Hemsworth", 2.5, 30, 20, 15);
        MailItem advertisement = new Advertisement("Tom Cruise", "Everybody in Hollywood", 0.1, 100);

        postOffice.addMailItem(letter);
        postOffice.addMailItem(packageItem);
        postOffice.addMailItem(advertisement);

        postOffice.printAllDetails();
        postOffice.calculateTotalShippingCost();
    }
}
