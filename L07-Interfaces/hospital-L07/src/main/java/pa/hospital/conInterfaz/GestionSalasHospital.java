package pa.hospital.conInterfaz;

public class GestionSalasHospital {
	public void reservarSala(ISala sala) {
		if(sala.getClass()==Quirofano.class) {
			Quirofano quiro = (Quirofano) sala;
			System.out.println("Reservado quirófano: "+quiro.getNombre());
		}else {
			SalaVideo video = (SalaVideo) sala;
			System.out.println("Reservada la "+video.getId());
		}
	}
	
	public void anularSala(ISala sala) {
		if(sala.getClass()==Quirofano.class) {
			Quirofano quiro = (Quirofano) sala;
			System.out.println("Anulado quirófano: "+quiro.getNombre());
		}else {
			SalaVideo video = (SalaVideo) sala;
			System.out.println("Anulada "+video.getId());
		}
	}
}
