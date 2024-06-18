/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Enrollment {

    
    public static void main(String[] args) {
    	
    	Student monica = new Student("Monica Geller","A00234");
    	Student joe = new Student("Joe Tribiani", "C22044");
    	Student chand = new Student("Chandler Bing", "A12003");
    	Student rachel = new Student("Rachel Green", "B66003");
    	
    	monica.addCredits(24);
    	joe.addCredits(56);
    	chand.addCredits(6);
    	rachel.addCredits(12);
    	
    	LabClass eli = new LabClass(2);
    	LabClass jose = new LabClass(1);
    	
    	eli.setInstructor("Eli");
    	jose.setInstructor("Jose Antonio");
    	
    	eli.setRoom("Aulario 2");
    	jose.setRoom("Aulario 2");
    	
    	eli.setTime("Miércoles, 15h");
    	jose.setTime("Miércoles, 17h");
    	
    	System.out.println("Students list\n");
    	monica.print();
    	joe.print();
    	chand.print();
    	rachel.print();
    	
    	System.out.println("\nEnroll students Eli\n");
    	eli.enrollStudent(monica);
    	eli.enrollStudent(joe);
    	System.out.println("\nEnroll students JOse");
    	jose.enrollStudent(chand);
    	jose.enrollStudent(rachel);
    	
    	eli.printList();
    	jose.printList();
      
    }
    
}
