package ejercicios_clase;

public class Cuenta {
	private String titular;
	private double cantidad;
	//primer constructor
	public Cuenta(String titular,double cantidad) {
		//titular=nuevotitular;
		//cantidad=nuevacantidad;
		this.titular=titular;
		this.cantidad=cantidad;
	}
	//segundo constructor
	public Cuenta(String titular) {
		this.titular=titular;
	}
}
