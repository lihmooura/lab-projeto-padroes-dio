package one.digitalinnovation.gof.singleton;


// Singleton "preguiçoso" 

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	
//	Construtor privado para impedir copia de fora do projeto na instancia
	private SingletonLazy() {
		super();
	}
	
//	Método expondo a instancia publica
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
			
		}
		return instancia;
	}
}
