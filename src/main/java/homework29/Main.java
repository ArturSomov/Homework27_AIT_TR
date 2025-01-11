package homework29;

public class Main {

    public static void main(String[] args) {
        User regularUser = new User(1, "Michael Smith", "michael.smith@example.com");
        PremiumUser premiumUser = new PremiumUser(2, "Jennifer Miner", "jenni.miner@example.com", "2025-02-31");
        AdminUser admin = new AdminUser(3, "Main Admin", "main.admin@example.com");

        regularUser.displayInfo();
        System.out.println("      ");

        premiumUser.displayInfo();
        String currentDate = "2025-01-10"; //In format YYYY-MM-DD
        System.out.println("Is Premium User Subscription Active? " + premiumUser.isSubscriptionActive(currentDate));
        System.out.println("      ");

        admin.displayInfo();
        System.out.println("      ");

        regularUser.addFriend(premiumUser);
        regularUser.addFriend(admin);

        Post post1 = regularUser.createPost("Hi there! I am happy to be here.");
        Post post2 = premiumUser.createPost("I am really enjoying to have all premium content");
        Post post3 = admin.createPost("Do not forget to follow community rules");

        post1.like();
        post2.like();
        post3.like();

        System.out.println("      ");
        admin.banUser(regularUser);
        System.out.println("Is regular user banned?: " +admin.isUserBanned(regularUser));

        System.out.println("      ");
        regularUser.viewFriendsPosts();

        System.out.println("\nIs " + regularUser.getName() + " " + "banned by admin?: " + admin.isUserBanned(regularUser));
    }
}
