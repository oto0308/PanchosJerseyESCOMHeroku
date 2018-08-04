package mx.com.ipn.escom;

public class Alumno {
	
	private int numBoleta;
	private String nombre;
	private String apellido;
	private String carrera;
	private String correo;
	
	
	public int getNumBoleta() {
		return numBoleta;
	}
	public void setNumBoleta(int numBoleta) {
		this.numBoleta = numBoleta;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
	/*
	public Alumno() {
		super();
		this.numBoleta=0;
		this.nombre=null;
		this.apellido=null;
		this.carrera=null;
		this.correo=null;
		
	}
	*/
	
	public Alumno() {
		
	}
	
	public Alumno(int numBoleta, String nombre, String apellido, String carrera, String correo) {
		this.numBoleta = numBoleta;
		this.nombre = nombre;
		this.apellido = apellido;
		this.carrera = carrera;
		this.correo = correo;
	}
	
	

}
