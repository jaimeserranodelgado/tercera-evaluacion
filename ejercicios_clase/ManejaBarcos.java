package ejercicios_clase;

public class ManejaBarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barco miPrimerBarquito,miSegundoBarquito;
		BarcoVelasCuadradas miBarquitoBebe;
		miPrimerBarquito=new Barco("velero",12,2);
		miSegundoBarquito=new Barco("bergatin",67,5);
		System.out.println(miPrimerBarquito.getNombreBarco());
		System.out.println(miSegundoBarquito.getNombreBarco());
		miBarquitoBebe=new BarcoVelasCuadradas("trirreme",10,1,true);
		System.out.println(miBarquitoBebe.getNombreBarco());
	}

}
