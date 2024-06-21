package pa.sorting;
import pa.interfaces.*;

/**
 * Write a description of class Grades here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Grade implements IOrdenable
{
    // instance variables - replace the example below with your own
    private double value;
    
    /**
     * Constructor for objects of class Grades
     */
    public Grade(double grade)
    {
        // initialise instance variables
        value = grade;
    }
    
    public double getValue() {
        return value;
    }
    
    @Override
    public boolean menorQue(IOrdenable o) {
    	boolean menor = false;
    	Grade grado = (Grade) o;
    	if(value<grado.value) {
    		menor = true;
    	}
    	return menor;
    }
}
