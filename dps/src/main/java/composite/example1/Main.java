package composite.example1;

public class Main {
    public static void main(String[] args) {
        // Arquivos individuais
        ItemSistema foto = new Arquivo("foto.png");
        ItemSistema documento = new Arquivo("documento.txt");

        // Pasta com arquivos
        Pasta documentos = new Pasta("Documentos");
        documentos.adicionar(foto);
        documentos.adicionar(documento);

        // Subpasta com arquivos
        Pasta projetos = new Pasta("Projetos");
        projetos.adicionar(new Arquivo("projeto1.java"));
        projetos.adicionar(new Arquivo("projeto2.java"));

        // Pasta raiz contendo tudo
        Pasta raiz = new Pasta("Raiz");
        raiz.adicionar(documentos);
        raiz.adicionar(projetos);
        raiz.adicionar(new Arquivo("README.md"));

        // Exibir estrutura
        raiz.exibir("");
    }
}