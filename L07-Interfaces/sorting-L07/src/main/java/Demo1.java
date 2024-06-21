import pa.sorting.*;
import pa.interfaces.*;
public class Demo1 {

	public static void main(String[] args) {
		Country[] paises = new Country[5];
		String[] lista_pa = {"España","Venezuela","Francia","Bélgica","Holanda"};
		
		for(int i=0;i<paises.length;i++) {
			paises[i] = new Country(lista_pa[i]);
		}
		
		Grade[] grades = new Grade[5];
		Double[] lista_notas = {8.5,4.5,0.2,5.0,1.6};
		for(int i=0;i<grades.length;i++) {
			grades[i] = new Grade(lista_notas[i]);
		}
		
		
		System.out.println("Original (Paises)\n================");
		for(Country c:paises) {
			System.out.println(c.getName());
		}
		
		System.out.println("Ordenado (Paises)\n================");
		Sort.selectionSort(paises);
		for(Country c:paises) {
			System.out.println(c.getName());
		}
		System.out.println("Original (Notas)\n================");
		for(Grade g:grades) {
			System.out.println(g.getValue());
		}
		
		System.out.println("Ordenado (Notas)\n================");
		Sort.selectionSort(grades);
		for(Grade g:grades) {
			System.out.println(g.getValue());
		}
	}

}
