package decorator.example2;

public class AppNotificacao {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorBasico();
        notificador = new NotificadorEmail(notificador);
        notificador = new NotificadorSMS(notificador);

        notificador.enviar("Sistema em manutenção às 22h");
    }
}