
package test;

public class Motor {
	
	public int numeroCilindro;
	public String tipo;
	public int registro;

	

	
public void cambiaRegistro(int registro) {
	this.registro = registro;
}

public void asignarTipo(String tipo) {
	if(tipo == "elctrico" ^ tipo == "gasolina"){
		this.tipo = tipo;
	}
	
}

}
