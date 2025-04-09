package composite.example2;

public class MenuItem implements MenuComponent {
    private String nome;

    public MenuItem(String nome) {
        this.nome = nome;
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "- " + nome);
    }
}