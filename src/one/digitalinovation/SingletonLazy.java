package one.digitalinovation;

// Singleton "preguiçoso"
// @author Yuri 

public class SingletonLazy {
    
    //criando uma instancia estatica de SingletonLazy
    private static SingletonLazy instancia;
 
    //garantindo que ninguem criara uma instancia de SingletonLazy
    private SingletonLazy () {
        super();
    }

    //garantingo que a instancia seja exposta para quem esta chamando
    public static synchronized SingletonLazy getInstancia () {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }        
        return instancia;
    }
}
