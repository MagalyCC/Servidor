package examen.cajas.liliana.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mensaje {
	private static final long serialVersionUID=1L;
	@Id
	private String codigo;
	private String texto;
	
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
