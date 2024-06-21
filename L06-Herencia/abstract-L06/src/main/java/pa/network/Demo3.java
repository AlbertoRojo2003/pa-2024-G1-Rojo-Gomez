package pa.network;

public class Demo3 {
	
	public static void main(String[] args) {
		NewsFeed n1 = new NewsFeed();
		PhotoPost p1 = new PhotoPost("Roberto","src/main/resources/imagenes/tigre.jpeg","Imagen de un tigre");
		PhotoPost p2 = new PhotoPost("Clara","src/main/resources/imagenes/leopardo.jpeg","¿Os gusta este Leopardo?");
		p2.addComment("Qué chulo!!");
		PhotoPost p3 = new PhotoPost("Aitor","src/main/resources/imagenes/guepardo.jpeg","Este es mi guepardo");
		for(int i=0;i<20;i++) {
			p3.like();
		}
		MessagePost m1 = new MessagePost("Gloria","Me gustó la peli de anoche");
		m1.addComment("A mí también");
		m1.addComment("Pues a mí no");
		
		
		n1.addPost(p1);
		n1.addPost(p2);
		n1.addPost(p3);
		n1.addPost(m1);
		
		n1.show();
	}
}