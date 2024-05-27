package ejercicios.ejercicio10;

public class Autor implements Comparable<Autor> {

	private String nombre;

	private String apellidos;

	private int id;
	private int edad;

	public Autor() {

	}

	public Autor(String nombre, String apellidos, int id, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.id = id;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Autor [nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + "]";
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Autor o) {
		// TODO Auto-generated method stub
		return this.id - o.id;
	}

}
