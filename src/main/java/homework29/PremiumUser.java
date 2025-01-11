package homework29;

public class PremiumUser extends User {

    private String subscriptionEndDate; //In format YYYY-MM-DD

    public PremiumUser(int id, String name, String email, String subscriptionEndDate) {
        super(id, name, email);
        this.subscriptionEndDate = subscriptionEndDate;
    }

    public boolean isSubscriptionActive (String currentDate) {
        return currentDate.compareTo(subscriptionEndDate) <= 0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Subscription End Date: " + subscriptionEndDate);
    }
}
