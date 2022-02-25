package dio.gof.singleton;

/**
 *  Singleton "Lazy Holder"
 * @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 * @ author falvojr
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }


}