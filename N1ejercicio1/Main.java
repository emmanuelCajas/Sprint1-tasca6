package tasca6.N1ejercicio1;


/*
 * Crea una clase llamada NoGenericMethods que almacene tres objetos del mismo tipo, junto con los métodos 
 * para almacenar y extraer estos objetos y un constructor para inicializar los tres. Comprueba que los 
 * argumentos se pueden poner en cualquier posición en el llamamiento al constructor.
 */


public class Main {

	public static void main(String[] args) {
		
		NoGenericMethods objeto1 = new NoGenericMethods("Emmanuel","Cajas","Ballesteros");
		System.out.println(objeto1);
		NoGenericMethods objeto2 = new NoGenericMethods("Cajas","Ballesteros","Emmanuel");
		System.out.println(objeto2);
		NoGenericMethods objeto3 = new NoGenericMethods("Ballesteros","Cajas","Emmanuel");
		System.out.println(objeto3);
		
	}
}//CAMBIAR ATRIBUTO DNI POR SEGUNDO APELLIDO
