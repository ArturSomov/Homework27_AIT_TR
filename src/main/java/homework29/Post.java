package homework29;

public class Post {

    private User author;
    private String content;
    private int likes;

    public Post(User author, String content) {
        this.author = author;
        this.content = content;
        this.likes = 0;
    }

    public void like() {
        likes++;
    }

    public void displayPost() {
        System.out.println("Author: " + author.getName() + ", Content: " + content + ", Likes: " + likes);
    }

    public String getContent() {
        return content;
    }
}
