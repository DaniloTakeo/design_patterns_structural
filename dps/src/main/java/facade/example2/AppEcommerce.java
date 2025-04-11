package facade.example2;

public class AppEcommerce {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 1);
        PedidoService pedidoService = new PedidoService();
        pedidoService.processarPedido(produto);
    }
}