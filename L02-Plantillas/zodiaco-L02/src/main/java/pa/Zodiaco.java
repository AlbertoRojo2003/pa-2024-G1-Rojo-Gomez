
package pa;


public class Zodiaco {
    private int dia;
    private int mes;
    private String signo;
    
    public Zodiaco(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        signo = "Desconocido";
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    /**
     * Devuelve cierto si la fecha es válida ¨(día: 1..31, mes:1..12), y
       falso en caso contrario   
    */  
    private boolean fecha_valida() {
       boolean valido = false;
       switch(mes) {
       	case 1:
       	case 3:
       	case 4:
       	case 5:
       	case 6:
       	case 7:
       	case 8:
       	case 9:
       	case 10:
       	case 11:
       	case 12:
       		switch(dia) {
   		 	case 1:
   		 	case 2:
   		 	case 3:
   		 	case 4:
   		 	case 5:
   		 	case 6:
   		 	case 7:
   		 	case 8:
   		 	case 9:
   		 	case 10:
   		 	case 11:
   		 	case 12:
   		 	case 13:
   		 	case 14:
   		 	case 15:
   		 	case 16:
   		 	case 17:
   		 	case 18:
   		 	case 19:
   		 	case 20:
   		 	case 21:
   		 	case 22:
   		 	case 23:
   		 	case 24:
   		 	case 25:
   		 	case 26:
   		 	case 27:
   		 	case 28:
   		 	case 29:
   		 	case 30:
   		 	case 31:
   		 		valido = true;
   		 		break;
   		 	
   		}
       	case 2:
       		switch(dia) {
   		 	case 1:
   		 	case 2:
   		 	case 3:
   		 	case 4:
   		 	case 5:
   		 	case 6:
   		 	case 7:
   		 	case 8:
   		 	case 9:
   		 	case 10:
   		 	case 11:
   		 	case 12:
   		 	case 13:
   		 	case 14:
   		 	case 15:
   		 	case 16:
   		 	case 17:
   		 	case 18:
   		 	case 19:
   		 	case 20:
   		 	case 21:
   		 	case 22:
   		 	case 23:
   		 	case 24:
   		 	case 25:
   		 	case 26:
   		 	case 27:
   		 	case 28:
   		 		valido = true;
   		 		break;	 	
   		}
       }
       return valido;
    }
 
    /**
     * Devuelve el nombre del signo asociado al día y mes de nacimiento, o el mensaje "Fecha inválida"   
    */
    public String obtener_signo() {
 
        if(fecha_valida()) {
        	
        	switch(mes) {
        	case 1:
        	case 2:
           	case 3:
           	case 4:
           		switch(dia) {
	       		 	case 1:
	       		 	case 2:
	       		 	case 3:
	       		 	case 4:
	       		 	case 5:
	       		 	case 6:
	       		 	case 7:
	       		 	case 8:
	       		 	case 9:
	       		 	case 10:
	       		 	case 11:
	       		 	case 12:
	       		 	case 13:
	       		 	case 14:
	       		 	case 15:
	       		 	case 16:
	       		 	case 17:
	       		 	case 18:
	       		 	case 19:
	       		 	case 20:
	       		 		signo = "Capricornio";
	       		 		break;
	       		 	case 21:
	       		 	case 22:
	       		 	case 23:
	       		 	case 24:
	       		 	case 25:
	       		 	case 26:
	       		 	case 27:
	       		 	case 28:
	       		 	case 29:
	       		 	case 30:
	       		 	case 31:
		       		 	signo = "Acuario";
	       		 		break;
           		}
           	case 5:
           	case 6:
           	case 7:
           	case 8:
           	case 9:
           		switch(dia) {
       		 	case 1:
       		 	case 2:
       		 	case 3:
       		 	case 4:
       		 	case 5:
       		 	case 6:
       		 	case 7:
       		 	case 8:
	       		 	switch(dia) {
	       		 	case 1:
	       		 	case 2:
	       		 	case 3:
	       		 	case 4:
	       		 	case 5:
	       		 	case 6:
	       		 	case 7:
	       		 	case 8:
	       		 	case 9:
	       		 	case 10:
	       		 	case 11:
	       		 	case 12:
	       		 	case 13:
	       		 	case 14:
	       		 	case 15:
	       		 	case 16:
	       		 	case 17:
	       		 	case 18:
	       		 	case 19:
	       		 	case 20:       		 		
	       		 	case 21:
	       		 	case 22:
	       		 	case 23:
	       		 	signo = "Leo";
	   		 		break;
	       		 	case 24:
	       		 	case 25:
	       		 	case 26:
	       		 	case 27:
	       		 	case 28:
	       		 	case 29:
	       		 	case 30:
	       		 	case 31:
		       		 	signo = "Virgo";
	       		 		break;
	       		}
       		 	case 9:
       		 	case 10:
       		 	case 11:
       		 	case 12:
       		 	case 13:
       		 	case 14:
       		 	case 15:
       		 	case 16:
       		 	case 17:
       		 	case 18:
       		 	case 19:
       		 	case 20:       		 		
       		 	case 21:
       		 	case 22:
       		 	case 23:
       		 	signo = "Virgo";
   		 		break;
       		 	case 24:
       		 	case 25:
       		 	case 26:
       		 	case 27:
       		 	case 28:
       		 	case 29:
       		 	case 30:
       		 	case 31:
	       		 	signo = "Libra";
       		 		break;
       		}
           	case 10:
           	case 11:
           		switch(dia) {
       		 	case 1:
       		 	case 2:
       		 	case 3:
       		 	case 4:
       		 	case 5:
       		 	case 6:
       		 	case 7:
       		 	case 8:
       		 	case 9:
       		 	case 10:
       		 	case 11:
       		 	case 12:
       		 	case 13:
       		 	case 14:
       		 	case 15:
       		 	case 16:
       		 	case 17:
       		 	case 18:
       		 	case 19:
       		 	case 20:       		 		
       		 	case 21:
       		 	case 22:
       		 	signo = "Escorpio";
   		 		break;
       		 	case 23:
       		 	case 24:
       		 	case 25:
       		 	case 26:
       		 	case 27:
       		 	case 28:
       		 	case 29:
       		 	case 30:
       		 	case 31:
	       		 	signo = "Sagitario";
       		 		break;
       		}
           	case 12:
        	}
        	
        }else {
        	signo = "Fecha inválida";
        }
        
        return signo;
    }    
}
