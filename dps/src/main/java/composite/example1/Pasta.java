package composite.example1;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItemSistema {
    private String nome;
    private List<ItemSistema> itens = new ArrayList<>();

    public Pasta(String nome) {
        this.nome = nome;
    }

    public void adicionar(ItemSistema item) {
        itens.add(item);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "+ Pasta: " + nome);
        for (ItemSistema item : itens) {
            item.exibir(indentacao + "  ");
        }
    }
}