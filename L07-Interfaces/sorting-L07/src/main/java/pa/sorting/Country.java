package pa.sorting;
import pa.interfaces.*;

/**
 * Write a description of class Contry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Country implements IOrdenable
{
    // instance variables - replace the example below with your own
    private String name;

    /**
     * Constructor for objects of class Contry
     */
    public Country(String name)
    {
        // initialise instance variables
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public boolean menorQue(IOrdenable o){
    	Country pais = (Country) o;
    	
    	return (name.compareTo(pais.name)<0);
    }
   
}
