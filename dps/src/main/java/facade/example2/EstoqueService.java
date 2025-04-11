package facade.example2;

public class EstoqueService {
    public boolean verificarDisponibilidade(Produto produto) {
        System.out.println("Verificando estoque para: " + produto.getNome());
        return produto.getQuantidade() <= 10; // Simulação
    }
}