/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Enrollment {

    
    public static void main(String[] args) {
    	System.out.println("Student's list:");
    	Student monica = new Student("Monica Geller", "A00234");
    	monica.addCredits(24);
    	monica.print();
    	
    	Student joe = new Student("Joe Tribiani", "C22044");
    	joe.addCredits(56);
    	joe.print();
    	
    	Student chand = new Student("Chandler Bing", "A12003");
    	chand.addCredits(6);
    	chand.print();
    	
    	Student rach = new Student("Rachel Green", "B66003");
    	rach.addCredits(12);
    	rach.print();
    	
    	LabClass clas1 = new LabClass(2);
    	clas1.setTime("Miércoles, 15h");
    	clas1.setRoom("Aulario 2");
    	clas1.enrollStudent(monica);
    	clas1.enrollStudent(joe);
    	
    	LabClass clas2 = new LabClass(2);
    	clas2.setTime("Miércoles,17h");
    	clas2.setRoom("Aulario 2");
    	clas2.enrollStudent(chand);
    	clas2.enrollStudent(rach);
    	
    	clas1.printList();
    	clas2.printList();
      
    }
    
}
