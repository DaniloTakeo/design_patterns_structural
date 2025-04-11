package facade.example1;

public class DVDPlayer {
    public void ligar() {
        System.out.println("DVD Player ligado.");
    }

    public void reproduzir(String filme) {
        System.out.println("Reproduzindo filme: " + filme);
    }

    public void desligar() {
        System.out.println("DVD Player desligado.");
    }
}