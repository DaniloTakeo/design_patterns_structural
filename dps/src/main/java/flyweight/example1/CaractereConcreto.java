package flyweight.example1;

public class CaractereConcreto implements Caractere {
    private final char simbolo;        // Intrínseco (compartilhado)
    private final String fonte;        // Intrínseco (compartilhado)

    public CaractereConcreto(char simbolo, String fonte) {
        this.simbolo = simbolo;
        this.fonte = fonte;
    }

    @Override
    public void exibir(int x, int y) {
        System.out.printf("Caractere '%c' na posição (%d, %d) com fonte '%s'%n", simbolo, x, y, fonte);
    }
}