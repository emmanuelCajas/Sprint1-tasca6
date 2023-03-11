package tasca6.N2ejercicio1;

/*
 * Crea una clase llamada Persona con los atributos nombre, apellido y edad. Después crea una clase
 *  llamada GenericMethods con un método genérico que acepte tres argumentos de tipo genérico. Este
 *   método solo debe imprimir por pantalla los argumentos que ha recibido. En el main() de la clase 
 *   principal, llama al método genérico con diferentes tipos de parámetros.

	Ejemplo: un objeto de la clase Persona, un String y un tipo primitivo.

	De esta manera has comprobado que se le puede pasar cualquier tipo de parámetro y en cualquier orden.
 */

/*
 * Modifica el ejercicio anterior de manera que uno de los argumentos del método genérico no sea genérico.
 */


public class Main {

	public static void main(String[] args) {
		
		Persona persona = new Persona("Emmanuel","Cajas",38);
		
		GenericMethods.metodoGenerico("abc", persona, 3500);
		GenericMethods.metodoGenerico("def", 3500, persona);
	}

}
