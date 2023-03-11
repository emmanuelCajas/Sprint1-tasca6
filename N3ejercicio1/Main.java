package tasca6.N3ejercicio1;

public class Main {

	public static void main(String[] args) {
		
		
		Smartphone s = new Smartphone();

		Generica g=new Generica();
		g.metodoTelefon(s);
		g.metodoSmarthone(s);

		
		//No puede llamar al metodo ferFotos
		//ya que no esta implementada en la interface y 
		//y el metodoTelefon esta limitado de la interface Telefon
	}
}
