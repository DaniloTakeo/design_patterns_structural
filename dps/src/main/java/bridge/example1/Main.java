package bridge.example1;

public class Main {
    public static void main(String[] args) {
        Renderizador raster = new Rasterizador();
        Renderizador vetor = new Vetorizador();

        Forma circuloRaster = new Circulo(raster);
        Forma quadradoVetor = new Quadrado(vetor);

        circuloRaster.desenhar();
        quadradoVetor.desenhar();
    }
}