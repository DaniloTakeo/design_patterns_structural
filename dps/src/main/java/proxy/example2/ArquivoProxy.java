package proxy.example2;

public class ArquivoProxy implements Arquivo {
    private final String nome;
    private final String usuario;
    private ArquivoReal arquivoReal;

    public ArquivoProxy(String nome, String usuario) {
        this.nome = nome;
        this.usuario = usuario;
    }

    @Override
    public void ler() {
        if ("admin".equalsIgnoreCase(usuario)) {
            if (arquivoReal == null) {
                arquivoReal = new ArquivoReal(nome);
            }
            arquivoReal.ler();
        } else {
            System.out.println("Acesso negado para o usuário: " + usuario);
        }
    }
}