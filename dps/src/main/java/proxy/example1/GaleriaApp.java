package proxy.example1;

public class GaleriaApp {
    public static void main(String[] args) {
        Imagem imagem1 = new ImagemProxy("foto1.jpg");
        Imagem imagem2 = new ImagemProxy("foto2.jpg");

        System.out.println("Miniaturas carregadas.");
        System.out.println("Exibindo imagem 1:");
        imagem1.exibir(); // Aqui a imagem será carregada do disco

        System.out.println("Exibindo imagem 1 novamente:");
        imagem1.exibir(); // Aqui o proxy usará a imagem já carregada

        System.out.println("Exibindo imagem 2:");
        imagem2.exibir(); // Aqui a imagem2 será carregada
    }
}