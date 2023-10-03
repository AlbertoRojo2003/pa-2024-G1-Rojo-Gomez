
package pa;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
    	Zodiaco fe1 = new Zodiaco(23,9);
    	Zodiaco fe2 = new Zodiaco(9,40);
    	Zodiaco fe3 = new Zodiaco(-3,8);
    	Zodiaco fe4 = new Zodiaco(23,11);
    	Zodiaco fe5 = new Zodiaco(21,1);
    	Zodiaco fe6 = new Zodiaco(23,8);
    	
    	System.out.println(fe1.obtener_signo());
    	System.out.println(fe2.obtener_signo());
    	System.out.println(fe3.obtener_signo());
    	System.out.println(fe4.obtener_signo());
    	System.out.println(fe5.obtener_signo());
    	System.out.println(fe6.obtener_signo());
    }
}    