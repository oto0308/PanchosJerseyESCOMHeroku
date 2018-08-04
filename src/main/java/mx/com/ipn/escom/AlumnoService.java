package mx.com.ipn.escom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/alumnos")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AlumnoService {
	private static Map<Integer, Alumno> alumnos = new HashMap<>();
	
	static {
		Alumno Otoniel = new Alumno(2014630453, "Otoniel", "Salgado", "Sistemas", "otoniel.i777@gmail.com");
		
		Alumno Dian = new Alumno(2012121212, "Dian", "Martinez", "Medicina", "dianm@gmail.com");
		
		alumnos.put(1, Otoniel);
		alumnos.put(2, Dian);
	}
	
	/*
	 * Este metodo nos regresara la lista de todos los clientes 
	 * existentes en la BD
	 */
	@GET
	public List<Alumno> geAlumnos(){
		return new ArrayList<Alumno>(alumnos.values());
	}
	
	
	/*
	 * Este metodo registra un nuevo alumno
	 * recibe de parametro un alumno
	 */
	@POST
	public void addAlumno(Alumno alumno) {
		alumnos.put(alumnos.size() + 1, alumno);
	}
	
	
	
	@DELETE
	@Path("/{alumnoId}")
	public void deleteAlumno(@PathParam("alumnoId") int id ) {
		alumnos.remove(id);
	}
	
	
	
}
