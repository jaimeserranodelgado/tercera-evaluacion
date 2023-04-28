package PrimerasClases;

public class ManejaPuntos {

	public static void main(String[] args) {
		// Esta clase sirve para ver si he utilizado
		// bien la clase Punto
		int x=2;
		double y=3.14;
		char l='A';
		boolean respuesta=true;
		String palabra;
		Punto miPrimerPuntito;//declaro un objeto de la clase punto
		
		miPrimerPuntito=new Punto(2,3);//Utilizo su constructor para inicializarlo
		System.out.println("Este punto dista del origen: ");
		System.out.print(miPrimerPuntito.devuelveDistanciaOrigen());
	}

}
