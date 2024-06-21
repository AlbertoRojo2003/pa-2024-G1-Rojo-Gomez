package pa.network;

public class Demo1 {
	public static void main(String[] args) {
		NewsFeed n1 = new NewsFeed();
		MessagePost m1 = new MessagePost("Alberto","Hola");
		PhotoPost p1 = new PhotoPost("Felipe","[src/main/resources/imagenes/leopardo.jpg]","Leopardo enfadado");
		
		n1.addMessagePost(m1);
		n1.addPhotoPost(p1);
		
		m1.like();
		m1.like();
		m1.like();
		m1.unlike();
		
		p1.addComment("Me encanta");
		p1.addComment("Barbaridad");
		n1.show();
		
	}
}
