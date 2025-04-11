package facade.example2;

public class NotaFiscalService {
    public void emitirNota(Produto produto) {
        System.out.println("Nota fiscal emitida para: " + produto.getNome());
    }
}