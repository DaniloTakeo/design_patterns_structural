package flyweight.example1;

public class EditorTexto {
    public static void main(String[] args) {
        String texto = "hello world";
        String fonte = "Arial";

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            Caractere caractere = CaractereFactory.getCaractere(letra, fonte);
            caractere.exibir(i, 0); // posição x = i, y = 0
        }

        System.out.println("Total de objetos de caractere criados: " + CaractereFactory.totalCaracteresCriados());
    }
}