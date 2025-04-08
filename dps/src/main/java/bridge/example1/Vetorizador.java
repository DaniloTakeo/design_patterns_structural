package bridge.example1;

public class Vetorizador implements Renderizador {
    @Override
    public void renderizarForma(String nome) {
        System.out.println("Desenhando " + nome + " com vetores.");
    }
}