package bridge.example1;

public abstract class Forma {
    protected Renderizador renderizador;

    public Forma(Renderizador renderizador) {
        this.renderizador = renderizador;
    }

    public abstract void desenhar();
}