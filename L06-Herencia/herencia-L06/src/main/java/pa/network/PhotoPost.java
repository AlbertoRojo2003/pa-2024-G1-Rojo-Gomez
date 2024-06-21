package pa.network;

import java.util.ArrayList;

import java.util.Date;
import java.text.SimpleDateFormat;

public class PhotoPost extends Post
{
    
    private String filename;  // the name of the image file
    private String caption;   // a one line image caption
    
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    public String getImageFile()
    {
        return filename;
    }

    public String getCaption()
    {
        return caption;
    }
    
    @Override
    public void display()
    {
        System.out.println("Message author: "+username);
        System.out.println("Message content: "+filename+" "+caption);
        System.out.println("Message date: "+ timeString(timestamp));
        System.out.println("Likes: "+likes);
        String comentarios = "";
        if(comments.isEmpty()==true) {
        	comentarios = "No comments";
        }else {
        	for(int i=0; i<comments.size();i++) {
        		int numerador = i+1;
        		comentarios += numerador +" "+ comments.get(i)+"\n";
        	}
        }
        System.out.println(comments.size()+" comments");
        System.out.println("Comentarios:\n"+comentarios+"\n");
    }
}
