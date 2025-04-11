package facade.example1;

public class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projetor projetor;
    private Luzes luzes;
    private Som som;

    public HomeTheaterFacade(DVDPlayer dvd, Projetor projetor, Luzes luzes, Som som) {
        this.dvd = dvd;
        this.projetor = projetor;
        this.luzes = luzes;
        this.som = som;
    }

    public void assistirFilme(String filme) {
        System.out.println("Preparando sistema para assistir ao filme...");
        luzes.escurecer();
        projetor.ligar();
        som.ligar();
        dvd.ligar();
        dvd.reproduzir(filme);
    }

    public void encerrarSessao() {
        System.out.println("Encerrando sessão de cinema...");
        dvd.desligar();
        som.desligar();
        projetor.desligar();
        luzes.acender();
    }
}