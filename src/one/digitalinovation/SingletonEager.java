package one.digitalinovation;

// Singleton "apressado"
// @author Yuri
// criando uma instancia estatica de SingletonEager
public class SingletonEager {
    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager () {
        super();
    }

    public static SingletonEager getInstancia () {
        return instancia;
    }
}
