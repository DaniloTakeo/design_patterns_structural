package facade.example1;

public class CinemaApp {
    public static void main(String[] args) {
        DVDPlayer dvd = new DVDPlayer();
        Projetor projetor = new Projetor();
        Luzes luzes = new Luzes();
        Som som = new Som();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projetor, luzes, som);

        homeTheater.assistirFilme("O Senhor dos Anéis");
        System.out.println("\n---\n");
        homeTheater.encerrarSessao();
    }
}