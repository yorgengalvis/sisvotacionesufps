package yorgengalvis.packages.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor	
@AllArgsConstructor
public class Votante {

	private int id;
	
	private String nombre;
	
	private String email;
	
	private String documento;
	
	private int tipodocumento;
	
	private int eleccion;
	
	public Votante(int id,String nombre,String email,String documento,int tipodocumento,int eleccion) {
		this.id=id;
		this.nombre=nombre;
		this.email=email;
		this.documento=documento;
		this.tipodocumento=tipodocumento;
		this.eleccion=eleccion;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getDocumento() {
		return this.documento;
	}
	
	public int getTipoDocumento() {
		return this.tipodocumento;
	}
	
	public int getEleccion() {
		return this.eleccion;
	}
	public int getId() {
		return this.id;
	}
	
}
