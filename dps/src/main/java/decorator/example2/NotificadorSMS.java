package decorator.example2;

public class NotificadorSMS extends NotificadorDecorator {
    public NotificadorSMS(Notificador wrappee) {
        super(wrappee);
    }

    @Override
    public void enviar(String mensagem) {
        super.enviar(mensagem);
        System.out.println("[SMS] Enviando SMS com a mensagem: " + mensagem);
    }
}