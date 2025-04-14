package flyweight.example2;

public class MapaApp {
    public static void main(String[] args) {
        adicionarMarcador("restaurante", 10, 20);
        adicionarMarcador("posto", 15, 25);
        adicionarMarcador("hospital", 20, 30);
        adicionarMarcador("restaurante", 40, 60);
        adicionarMarcador("posto", 100, 120);

        System.out.println("Total de ícones únicos criados: " + IconeFactory.totalIconesCriados());
    }

    private static void adicionarMarcador(String tipo, int x, int y) {
        Icone icone = IconeFactory.getIcone(tipo);
        icone.exibir(x, y);
    }
}