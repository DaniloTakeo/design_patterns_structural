package flyweight.example2;

public class IconeConcreto implements Icone {
    private final String tipo; // Intrínseco
    private final String imagem; // Intrínseco (simulado com String)

    public IconeConcreto(String tipo) {
        this.tipo = tipo;
        this.imagem = "[Imagem: " + tipo + "]";
    }

    @Override
    public void exibir(int x, int y) {
        System.out.printf("Exibindo %s na posição (%d, %d)%n", imagem, x, y);
    }
}