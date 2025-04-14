package flyweight.example1;

import java.util.HashMap;
import java.util.Map;

public class CaractereFactory {
    private static final Map<String, Caractere> caracteres = new HashMap<>();

    public static Caractere getCaractere(char simbolo, String fonte) {
        String chave = simbolo + "-" + fonte;
        if (!caracteres.containsKey(chave)) {
            caracteres.put(chave, new CaractereConcreto(simbolo, fonte));
        }
        return caracteres.get(chave);
    }

    public static int totalCaracteresCriados() {
        return caracteres.size();
    }
}