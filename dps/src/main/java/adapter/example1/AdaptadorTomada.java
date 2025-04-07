package adapter.example1;

public class AdaptadorTomada implements TomadaDeTresPinos {
    private TomadaDeDoisPinos tomadaDeDoisPinos;

    public AdaptadorTomada(TomadaDeDoisPinos tomadaDeDoisPinos) {
        this.tomadaDeDoisPinos = tomadaDeDoisPinos;
    }

    @Override
    public void ligarNaTomadaDeTresPinos() {
        System.out.println("Adaptador convertendo para dois pinos...");
        tomadaDeDoisPinos.ligarNaTomadaDeDoisPinos();
    }
}