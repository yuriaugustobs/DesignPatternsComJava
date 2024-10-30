package one.digitalinovation;

public class SingletonLazyHolder {

    private static class InstanceHolder {
        private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
} 