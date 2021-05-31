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
	
}
