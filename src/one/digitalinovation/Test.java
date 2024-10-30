package one.digitalinovation;

public class Test {
    public static void main(String[] args) {
        // Testando Singleton Lazy (inicialização preguiçosa)
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        // Testando Singleton Eager (inicialização antecipada)
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        // Testando Singleton LazyHolder (inicialização thread-safe com holder)
        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }
}
