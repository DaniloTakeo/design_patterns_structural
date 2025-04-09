package composite.example2;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {
    private String titulo;
    private List<MenuComponent> itens = new ArrayList<>();

    public Menu(String titulo) {
        this.titulo = titulo;
    }

    public void adicionar(MenuComponent componente) {
        itens.add(componente);
    }

    @Override
    public void exibir(String indentacao) {
        System.out.println(indentacao + "+ " + titulo);
        for (MenuComponent componente : itens) {
            componente.exibir(indentacao + "  ");
        }
    }
}