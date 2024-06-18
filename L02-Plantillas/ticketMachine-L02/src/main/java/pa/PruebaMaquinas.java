/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class PruebaMaquinas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	TicketMachine maq1 = new TicketMachine(20);
    	TicketMachine maq2 = new TicketMachine(30);
    	TicketMachine maq3 = new TicketMachine(40);
    	
    	System.out.println("Precio maq1= "+maq1.getPrice());
    	maq2.getPrice();
    	maq3.getPrice();
    	
    	maq1.insertMoney(10);
    	maq1.insertMoney(5);
    	maq1.getBalance();
    	maq1.printTicket();
    	
    	maq2.insertMoney(10);
    	maq2.insertMoney(30);
    	maq2.getBalance();
    	maq2.printTicket();
    	
    	maq3.insertMoney(20);
    	maq3.insertMoney(20);
    	maq3.getBalance();
    	maq3.printTicket();
    	
    	System.out.println("Otras cosas");
    	maq2.insertMoney(20);
    	maq2.getBalance();
    	maq2.printTicket();
    	
    	System.out.println("\n\n TOTALES \n\n");
    	maq1.getTotal();
    	maq2.getTotal();
    	maq3.getTotal();
    	
    	System.out.println("DEvolucion");
    	maq2.insertMoney(80);
    	maq2.getBalance();
    	maq2.refundBalance();
    	
    	maq1.getTotal();
    	maq2.getTotal();
    	maq3.getTotal();
    	
                     
    }
    
}
