package dio.gof.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Move-se normalmente...");
    }
}
