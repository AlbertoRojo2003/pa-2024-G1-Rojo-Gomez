package pa.hospital.conInterfaz;

public class DemoConInterfaz {
	public static void main(String[] args) {
		GestionSalasHospital gestion=new GestionSalasHospital();
		
		Quirofano q0=new Quirofano();
		Quirofano q1=new Quirofano();
		Quirofano q2=new Quirofano();
		Quirofano q3=new Quirofano();
		Quirofano q4=new Quirofano();
		
		gestion.reservarSala(q0);
		gestion.reservarSala(q1);
		gestion.reservarSala(q2);
		gestion.reservarSala(q3);
		gestion.reservarSala(q4);
		
		SalaVideo sv0= new SalaVideo();
		SalaVideo sv1= new SalaVideo();
		SalaVideo sv2= new SalaVideo();
		SalaVideo sv3= new SalaVideo();
		SalaVideo sv4= new SalaVideo();
		SalaVideo sv5= new SalaVideo();
		SalaVideo sv6= new SalaVideo();
		SalaVideo sv7= new SalaVideo();
		SalaVideo sv8= new SalaVideo();
		SalaVideo sv9= new SalaVideo();
		
		gestion.reservarSala(sv0);
		gestion.reservarSala(sv1);
		gestion.reservarSala(sv2);
		gestion.reservarSala(sv3);
		gestion.reservarSala(sv4);
		gestion.reservarSala(sv5);
		gestion.reservarSala(sv6);
		gestion.reservarSala(sv7);
		gestion.reservarSala(sv8);
		gestion.reservarSala(sv9);
		
		gestion.anularSala(q0);
		gestion.anularSala(q1);
		gestion.anularSala(q2);
		gestion.anularSala(q3);
		gestion.anularSala(q4);
		
		gestion.anularSala(sv0);
		gestion.anularSala(sv1);
		gestion.anularSala(sv2);
		gestion.anularSala(sv3);
		gestion.anularSala(sv4);
		gestion.anularSala(sv5);
		gestion.anularSala(sv6);
		gestion.anularSala(sv7);
		gestion.anularSala(sv8);
		gestion.anularSala(sv9);
	}
}
