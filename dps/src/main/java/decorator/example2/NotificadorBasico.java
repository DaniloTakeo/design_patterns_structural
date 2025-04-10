package decorator.example2;

public class NotificadorBasico implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("[LOG] " + mensagem);
    }
}