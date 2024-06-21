package pa.network;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * This class stores information about a post in a social network. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.1
 */
public class MessagePost extends Post
{
    private String message;   // an arbitrarily long, multi-line message

    public MessagePost(String author, String text)
    {
        super(author);
        message = text;
    }

    public String getText()
    {
        return message;
    }
    
    @Override
    public void display()
    {
        System.out.println("Message author: "+username);
        System.out.println("Message content: "+message);
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
