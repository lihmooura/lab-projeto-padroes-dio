package one.digitalinnovation.gof.singleton;

//Singleton "apressado" 


public class SingletonEager {
	
	private static SingletonEager instancia;
	

	private SingletonEager() {
		super();
	}
	

// Após instancia definida já pode ser usada.

	public static SingletonEager getInstancia() {
		
		return instancia;
	}
}