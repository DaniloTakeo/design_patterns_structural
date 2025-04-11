package facade.example2;

public class EmailService {
    public void enviarConfirmacao(Produto produto) {
        System.out.println("Email enviado confirmando a compra de: " + produto.getNome());
    }
}