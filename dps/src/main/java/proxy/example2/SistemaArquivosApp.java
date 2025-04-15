package proxy.example2;

public class SistemaArquivosApp {
    public static void main(String[] args) {
        Arquivo arquivo1 = new ArquivoProxy("relatorio_financeiro.pdf", "admin");
        Arquivo arquivo2 = new ArquivoProxy("relatorio_financeiro.pdf", "visitante");

        arquivo1.ler(); // Acesso permitido
        arquivo2.ler(); // Acesso negado
    }
}