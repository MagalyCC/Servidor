package examen.cajas.liliana.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Persona {
	private static final long serialVersionUID=1L;
	@Id
	private String cedula;
	private String nombre;
	 private int numero;

	@OneToOne
	@JoinColumn(name="mensaje")
	private Mensaje sms;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	} 
	
	 public int getNumero() {
			return numero;
		}

		public void setNumero(int numero) {
			this.numero = numero;
		}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Mensaje getSms() {
		return sms;
	}

	public void setSms(Mensaje sms) {
		this.sms = sms;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

