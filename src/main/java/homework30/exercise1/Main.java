package homework30.exercise1;

public class Main {

    public static void main(String[] args) {

        Post post = new Post();

        post.like();
        post.like();
        post.like();
        post.like();

        post.addComment("My name is Admin.");
        post.addComment("Nice weather.");
        post.addComment("What a nice day!");

        System.out.println("Likes: " + post.getLikesCount());
        System.out.println("Comments:");
        for (String comment : post.getComments()) {
            System.out.println("- " + comment);
        }
    }
}
