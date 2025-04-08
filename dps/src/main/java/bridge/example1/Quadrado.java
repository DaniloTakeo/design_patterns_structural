package bridge.example1;

public class Quadrado extends Forma {
    public Quadrado(Renderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void desenhar() {
        renderizador.renderizarForma("quadrado");
    }
}