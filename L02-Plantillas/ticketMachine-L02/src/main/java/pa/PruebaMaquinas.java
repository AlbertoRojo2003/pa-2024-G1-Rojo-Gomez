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
    	System.out.println("Máquina 1. Precio ticket = "+maq1.getPrice());
    	System.out.println("Máquina 2. Precio ticket = "+maq2.getPrice());
    	System.out.println("Máquina 3. Precio ticket = "+maq3.getPrice());
    	
    	System.out.println("Máquina 1. Insertamos 10");
    	maq1.insertMoney(10);
    	System.out.println("Máquina 1. Insertamos 5");
    	maq1.insertMoney(5);
    	System.out.println("Valor de monedas insertadas= "+maq1.getBalance());
    	System.out.println("Solicitamos ticket");
    	maq1.printTicket();
    	
    	System.out.println("Máquina 2. Insertamos 10");
    	maq2.insertMoney(10);
    	System.out.println("Máquina 2. Insertamos 30");
    	maq2.insertMoney(30);
    	System.out.println("Valor de monedas insertadas= "+maq2.getBalance());
    	System.out.println("Solicitamos ticket");
    	maq2.printTicket();
    	
    	System.out.println("Máquina 3. Insertamos 20");
    	maq3.insertMoney(20);
    	System.out.println("Máquina 3. Insertamos 20");
    	maq3.insertMoney(20);
    	System.out.println("Valor de monedas insertadas= "+maq3.getBalance());
    	System.out.println("Solicitamos ticket");
    	maq3.printTicket();
    	
    	System.out.println("Máquina 2. Insertamos 20");
    	
    	maq2.insertMoney(20);
    	System.out.println("Máquina 2. Valor de monedas insertadas"+maq2.getBalance());
    	maq2.printTicket();
    	
    	System.out.println(maq1.getTotal());
    	System.out.println(maq2.getTotal());
    	System.out.println(maq3.getTotal());
    	
    	System.out.println("Máquina 2. Insertamos 80");
    	maq2.insertMoney(80);
    	System.out.println("Valor de monedas insertadas: "+maq2.getBalance());
    	maq2.refundBalance();
    	System.out.println("Valor de monedas insertadas: "+maq2.getBalance());
    	
    	System.out.println(maq1.getTotal());
    	System.out.println(maq2.getTotal());
    	System.out.println(maq3.getTotal());
    }
    
}
