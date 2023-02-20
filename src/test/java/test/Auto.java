
public class Auto {
	public String modelo;
	public int precio;
    public Asiento[] asientos;
 	public String marca;
	public Motor motor;
	public int registro;
	public static int cantidadCreados;
	
	public int cantidadAsientos(){
			int contador=0;
			for (int i =0; i< asientos.length;i++){
				if(asientos[i] instanceof Asiento) {
					contador++;
				}
			}
			return contador;
	}
	
	public String verificarIntegridad() {
		
		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] != null) {
				if (asientos[i].registro != this.registro) { 
					return "Las piezas no son originales";
					}
			}
		}
		
		if (this.registro != motor.registro) {
			return "Las piezas no son originales";
		}
		return "Auto original";
	}

}