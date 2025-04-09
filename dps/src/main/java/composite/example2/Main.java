package composite.example2;

public class Main {
    public static void main(String[] args) {
        // Itens simples
        MenuItem abrir = new MenuItem("Abrir");
        MenuItem salvar = new MenuItem("Salvar");
        MenuItem sair = new MenuItem("Sair");

        // Submenu Arquivo
        Menu menuArquivo = new Menu("Arquivo");
        menuArquivo.adicionar(abrir);
        menuArquivo.adicionar(salvar);
        menuArquivo.adicionar(sair);

        // Submenu Editar
        Menu menuEditar = new Menu("Editar");
        menuEditar.adicionar(new MenuItem("Copiar"));
        menuEditar.adicionar(new MenuItem("Colar"));

        // Menu principal
        Menu menuPrincipal = new Menu("Menu Principal");
        menuPrincipal.adicionar(menuArquivo);
        menuPrincipal.adicionar(menuEditar);

        // Exibir estrutura
        menuPrincipal.exibir("");
    }
}