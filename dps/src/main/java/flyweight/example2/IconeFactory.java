package flyweight.example2;

import java.util.HashMap;
import java.util.Map;

public class IconeFactory {
    private static final Map<String, Icone> icones = new HashMap<>();

    public static Icone getIcone(String tipo) {
        if (!icones.containsKey(tipo)) {
            icones.put(tipo, new IconeConcreto(tipo));
        }
        return icones.get(tipo);
    }

    public static int totalIconesCriados() {
        return icones.size();
    }
}