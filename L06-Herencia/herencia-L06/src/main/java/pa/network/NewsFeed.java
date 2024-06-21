package pa.network;

import pa.network.MessagePost;

import java.util.ArrayList;
import pa.network.MessagePost;

public class NewsFeed
{
    private ArrayList<Post> posts;

    /**
     * Construct an empty news feed.
     */
    public NewsFeed()
    {
        posts = new ArrayList<>();
    }

    public void addPost(Post p) {
    	posts.add(p);
    }
    
    public void show()  {
    	for(int i=0; i<posts.size();i++) {
    		posts.get(i).display();
    	}
    }
}
