package adapter.example1;

public class Cliente {
    public static void main(String[] args) {
        TomadaDeDoisPinos tomadaDois = new TomadaDeDoisPinos();
        TomadaDeTresPinos adaptador = new AdaptadorTomada(tomadaDois);

        adaptador.ligarNaTomadaDeTresPinos();
    }
}