package proxy.example1;

public class ImagemProxy implements Imagem {
    private final String nomeArquivo;
    private ImagemReal imagemReal;

    public ImagemProxy(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void exibir() {
        if (imagemReal == null) {
            imagemReal = new ImagemReal(nomeArquivo);
        }
        imagemReal.exibir();
    }
}