package composite.example1;

public class Arquivo implements ItemSistema {
    private String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "- Arquivo: " + nome);
    }
}