package tasca6.N3ejercicio1;

public class Generica {

	public  <T extends Telefon> void metodoTelefon(T t) {
		t.llamar();
	}
	
	public <T extends Smartphone> void metodoSmarthone(T s) {
		s.llamar();
		s.ferFotos();
		
	}
}
