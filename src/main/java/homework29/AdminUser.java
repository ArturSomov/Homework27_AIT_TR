package homework29;

import java.util.HashSet;
import java.util.Set;

public class AdminUser extends User {

    private Set<User> bannedUsers = new HashSet<>();

    public AdminUser(int id, String name, String email) {
        super(id, name, email);
    }

    public void banUser (User user) {
        bannedUsers.add(user);
        System.out.println("User " + user.getName() + " has been banned.");
    }

    public boolean isUserBanned(User user) {
        return bannedUsers.contains(user);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Admin rights: Yes");
    }
}
