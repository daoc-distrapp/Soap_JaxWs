package daoc.soapjaxws;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Empleado {
	@Id
	@GeneratedValue
	private int id;
	private String nombre;
	private String cargo;
	
	public Empleado() {}
	public Empleado(String nombre, String cargo) {
		this.nombre = nombre;
		this.cargo = cargo;
	}
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", cargo=" + cargo + "]";
	}
}
