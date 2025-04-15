package proxy.example2;

public class ArquivoReal implements Arquivo {
    private final String nome;

    public ArquivoReal(String nome) {
        this.nome = nome;
    }

    @Override
    public void ler() {
        System.out.println("Lendo o conteúdo do arquivo: " + nome);
    }
}