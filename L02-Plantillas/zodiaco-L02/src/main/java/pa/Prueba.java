
package pa;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Zodiaco f1 = new Zodiaco(23,9);
    	Zodiaco f2 = new Zodiaco(9,40);
    	Zodiaco f3 = new Zodiaco(-3,8);
    	Zodiaco f4 = new Zodiaco(23,11);
    	Zodiaco f5 = new Zodiaco(21,1);
    	Zodiaco f6 = new Zodiaco(23,8);
    	System.out.println(f1.obtener_signo());
    	System.out.println(f2.obtener_signo());
    	System.out.println(f3.obtener_signo());
    	System.out.println(f4.obtener_signo());
    	System.out.println(f5.obtener_signo());
    	System.out.println(f6.obtener_signo());
 
    }
}    