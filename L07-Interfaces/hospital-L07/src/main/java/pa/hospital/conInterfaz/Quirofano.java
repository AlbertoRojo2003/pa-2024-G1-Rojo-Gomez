package pa.hospital.conInterfaz;

public class Quirofano implements ISala{
	private String sala;
	private final String nombre="quirofano-";
	private static int id = 0;
	
	public Quirofano() {
		id++;
		sala = nombre+id;
	}	

	public String getNombre() {
		return sala;
	}
}
