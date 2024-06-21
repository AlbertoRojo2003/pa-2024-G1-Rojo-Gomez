package pa.network;

public class Demo2 {
	
	public static void main(String[] args) {
		NewsFeed n1 = new NewsFeed();
		Post p1 = new Post("Alberto");
		
		for(int i=0;i<5;i++) {
			p1.addComment("Comentario "+(i+1));
		}
		for(int i=0;i<17;i++) {
			p1.like();
		}
		for(int i=0;i<13;i++) {
			p1.unlike();
		}
		
		n1.addPost(p1);
		n1.show();
	}
}
