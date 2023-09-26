/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa;


public class Dibujar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    	Square cuadrado_a = new Square();
    	cuadrado_a.changeColor("blue");
    	cuadrado_a.moveHorizontal(-200);
    	cuadrado_a.makeVisible();
        
    	Square cuadrado_b = new Square();
    	cuadrado_b.changeColor("green");
    	cuadrado_b.moveHorizontal(10);
    	cuadrado_b.makeVisible();
    	
    	Square cuadrado_c = new Square();
    	cuadrado_c.changeColor("black");
    	cuadrado_c.changeSize(20);
    	cuadrado_c.moveDown();
    	cuadrado_c.moveDown();
    	cuadrado_c.moveRight();
    	cuadrado_c.moveHorizontal(10);
    	cuadrado_c.makeVisible();
    	
    	Square cuadrado_d = new Square();
    	cuadrado_d.changeColor("magenta");
    	cuadrado_d.changeSize(20);
    	cuadrado_d.moveDown();
    	cuadrado_d.moveDown();
    	cuadrado_d.moveRight();
    	cuadrado_d.moveHorizontal(-200);
    	cuadrado_d.makeVisible();
    	
    	Person persona = new Person();
    	persona.moveHorizontal(-30);
    	persona.moveVertical(-40);
    	persona.makeVisible();
    	
    	Triangle trian1 = new Triangle();
    	trian1.changeColor("red");
    	trian1.moveHorizontal(-70);
    	trian1.moveVertical(-80);
    	trian1.makeVisible();
    	
    	Triangle trian2 = new Triangle();
    	trian2.changeColor("red");
    	trian2.moveHorizontal(140);
    	trian2.moveVertical(-80);
    	trian2.makeVisible();
    	
    	Circle sol = new Circle();
    	sol.changeColor("yellow");
    	sol.moveLeft();
    	sol.moveVertical(-50);
    	sol.makeVisible();
    }
    
}
