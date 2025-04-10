package decorator.example1;

public class Cafeteria {
    public static void main(String[] args) {
        Bebida pedido = new CafeSimples();
        pedido = new ComLeite(pedido);
        pedido = new ComChocolate(pedido);

        System.out.println("Pedido: " + pedido.getDescricao());
        System.out.println("Preço: R$ " + pedido.getPreco());
    }
}