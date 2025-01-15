package homework30.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Post implements Likable, Commentable {
    private int likesCount;
    private List<String> comments;

    public Post() {
        this.likesCount = 0;
        this.comments = new ArrayList<>();
    }

    @Override
    public void addComment(String comment) {
        comments.add(comment);
    }

    @Override
    public List<String> getComments() {
        return comments;
    }

    @Override
    public void like() {
        likesCount++;
    }

    @Override
    public int getLikesCount() {
        return likesCount;
    }
}


