package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.singleton.SingletonLazyHolder;
import dio.gof.strategy.*;

public class Test {
    public static void main(String[] args){
        // Testes relacionados ao Design Pattern Singleton:

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Testes relacionados ao Design Pattern Strategy:

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robor robor = new Robor();
        robor.setComportamento(normal);
        robor.mover();
        robor.mover();
        robor.setComportamento(defensivo);
        robor.mover();
        robor.setComportamento(agressivo);
        robor.mover();
        robor.mover();
        robor.mover();

        // Testes relacionados ao Design Pattern Facade:

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14801788");

    }
}
