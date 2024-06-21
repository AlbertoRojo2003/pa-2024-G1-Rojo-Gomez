package pa.hospital.conInterfaz;

public class SalaVideo implements ISala{
	private static int id = 0;
	private String nombre;
	public SalaVideo() {
		id++;
		nombre="Sala "+id;
	}
	public String getId() {
		return nombre;
	}
}
