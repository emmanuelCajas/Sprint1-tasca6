package tasca6.N2ejercicio2;

public class GenericMethods {

	public static <K> void metodoGenerico(K... lista) {
		//System.out.println(objeto1 + "//"+ objeto2 + "//" + objeto3);
		
	     for (K elemento : lista) {
	            System.out.println(elemento);
	        }
	};
		
}
