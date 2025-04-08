package bridge.example1;

public class Circulo extends Forma {
    public Circulo(Renderizador renderizador) {
        super(renderizador);
    }

    @Override
    public void desenhar() {
        renderizador.renderizarForma("círculo");
    }
}