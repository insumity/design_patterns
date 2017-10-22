import java.util.HashMap;
import java.util.Map;

public class NewFacebookPosterImpl implements NewFacebookPoster {

    private static long postId = 0;
    private static Map<Long, Post> posts;

    public NewFacebookPosterImpl() {
        posts = new HashMap<>();
    }

    @Override
    public long post(Post post) {
        System.out.println("Using the NewFacebookPoster.post");
        posts.put(postId, post);
        postId++;
        return postId - 1;
    }

    @Override
    public Post get(long postId) {
        System.out.println("Using the NewFacebookPoster.get");
        return posts.get(postId);
    }
}
