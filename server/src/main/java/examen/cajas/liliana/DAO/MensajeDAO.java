package examen.cajas.liliana.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import examen.cajas.liliana.modelo.Mensaje;
import examen.cajas.liliana.modelo.Persona;

@Stateless
public class MensajeDAO {

	@Inject
	private Connection con;
	@Inject
	private EntityManager em;
	
	//crud
	
	public boolean insertJPA(Mensaje entity) throws SQLException {
		em.persist(entity);
		return true;
	}

	

	public void updateJPA(Mensaje sms) throws Exception {
        try {
            em.merge(sms);
        } catch (Exception e) {
            throw new Exception("Error actualizar mensaje " +e.getMessage());
        }
    }
	
	
	/*
	public List<Persona> getClientes(String cedula) {
		String jpql= "Select c from Persona c where c.cedula =?1";
		Query q = em.createQuery(jpql, Persona.class);
		q.setParameter(1, cedula);
		return (List<Persona>) q.getResultList();
	}
	


    public void deleteId(String cedula) throws Exception {
        try {
            em.remove(read(cedula));
        } catch (Exception e) {
            throw new Exception("Error Eliminar Cliente " +e.getMessage());
        }
    }
   
    
    public Persona read(String cedula) throws Exception {
        try {
            return em.find(Persona.class, cedula);
        } catch (Exception e) {
            throw new Exception("Erro leer Cliente " +e.getMessage());
        }
    }*/
}
