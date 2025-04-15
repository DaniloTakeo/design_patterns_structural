package proxy.example1;

public class ImagemReal implements Imagem {
    private final String nomeArquivo;

    public ImagemReal(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        carregarDoDisco();
    }

    private void carregarDoDisco() {
        System.out.println("Carregando imagem do disco: " + nomeArquivo);
    }

    @Override
    public void exibir() {
        System.out.println("Exibindo imagem: " + nomeArquivo);
    }
}