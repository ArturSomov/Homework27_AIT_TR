package homework29;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String name;
    private String email;
    private List<User> friends;
    private List<Post> posts;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.friends = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void addFriend(User user) {
        if (!friends.contains(user)) {
            friends.add(user);
            System.out.println(name + " and " + user.getName() + " are now friends.");
        } else {
            System.out.println(user.getName() + " is already in friend list.");
        }
    }

    public void removeFriend(User user) {
        if (friends.remove(user)) {
            System.out.println(name + " has removed " + user.getName() + " from friend list.");
        } else {
            System.out.println(user.getName() + " was not found in friend list.");
        }
    }

    public List<User> getFriends() {
        return new ArrayList<>(friends);
    }

    public Post createPost(String content) {
        Post post = new Post(this, content);
        posts.add(post);
        return post;
    }

    public List<Post> getPosts() {
        return new ArrayList<>(posts);
    }

    public void viewFriendsPosts() {
        System.out.println("Friends posts of " + name + ":");
        for (User friend : friends) {
            for (Post post : friend.getPosts()) {
                post.displayPost();
            }
        }
    }

    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

