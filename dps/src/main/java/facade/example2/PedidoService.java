package facade.example2;

public class PedidoService {
    private EstoqueService estoque;
    private PagamentoService pagamento;
    private NotaFiscalService notaFiscal;
    private EmailService email;

    public PedidoService() {
        this.estoque = new EstoqueService();
        this.pagamento = new PagamentoService();
        this.notaFiscal = new NotaFiscalService();
        this.email = new EmailService();
    }

    public void processarPedido(Produto produto) {
        System.out.println("Processando pedido...");

        if (estoque.verificarDisponibilidade(produto)) {
            pagamento.autorizarPagamento();
            notaFiscal.emitirNota(produto);
            email.enviarConfirmacao(produto);
        } else {
            System.out.println("Produto fora de estoque.");
        }
    }
}