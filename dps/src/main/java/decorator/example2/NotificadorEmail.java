package decorator.example2;

public class NotificadorEmail extends NotificadorDecorator {
    public NotificadorEmail(Notificador wrappee) {
        super(wrappee);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("[EMAIL] Enviando email com a mensagem: " + mensagem);
    }
}