package examen.cajas.liliana.ON;

import java.sql.SQLException;

import javax.ejb.Stateless;
import javax.inject.Inject;

import examen.cajas.liliana.DAO.PersonaDao;
import examen.cajas.liliana.modelo.Persona;
import examen.cajas.liliana.DAO.MensajeDAO;
@Stateless
public class PersonaON implements PersonaONRemoto{
	@Inject
	private PersonaDao daoPersona;
	@Inject
	private MensajeDAO daomensaje;

	//Registrar persona 
		public boolean registrarPersona(Persona cliente) throws Exception {
			if (cliente.getCedula().length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				//Mensaje sms1=cliente.getSms();
			//	daomensaje.insertJPA(sms1);
				daoPersona.insertJPA(cliente);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
		
		public boolean actualizarPersona(Persona cliente) throws Exception {
			if (cliente.getCedula().length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				daoPersona.updateJPA(cliente);

			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			
			return true;
		}
		public boolean eliminarPersona(String cedula) throws Exception {
			if (cedula.length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				daoPersona.deleteId(cedula);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
			return true;
		}
		public Persona buscarPersona(String cedula) throws Exception {
			if (cedula.length() != 10)
				throw new Exception("La cedula no cumple con la longitud correcta");
			try {
				return  daoPersona.read(cedula);
			} catch (SQLException e) {
				e.printStackTrace();
				throw new Exception("Error al registrar");
			}
		}
}
