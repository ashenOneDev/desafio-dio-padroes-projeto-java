package dio.gof.strategy;

public class Robor {

    private Comportamento comportamento;

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }

}
