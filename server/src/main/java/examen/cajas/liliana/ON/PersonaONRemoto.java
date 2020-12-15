package examen.cajas.liliana.ON;

import javax.ejb.Remote;

import examen.cajas.liliana.modelo.Persona;

@Remote
public interface PersonaONRemoto {
	public boolean registrarPersona(Persona cliente) throws Exception;
	public boolean actualizarPersona(Persona cliente) throws Exception;
	public boolean eliminarPersona(String cedula) throws Exception;
	public Persona buscarPersona(String cedula) throws Exception;
	
}
