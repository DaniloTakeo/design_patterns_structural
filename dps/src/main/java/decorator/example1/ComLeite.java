package decorator.example1;

public class ComLeite extends BebidaDecorator {
    public ComLeite(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", leite";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.5;
    }
}