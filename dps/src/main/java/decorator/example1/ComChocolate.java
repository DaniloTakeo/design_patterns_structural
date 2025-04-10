package decorator.example1;

public class ComChocolate extends BebidaDecorator {
    public ComChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescricao() {
        return bebida.getDescricao() + ", chocolate";
    }

    @Override
    public double getPreco() {
        return bebida.getPreco() + 0.7;
    }
}