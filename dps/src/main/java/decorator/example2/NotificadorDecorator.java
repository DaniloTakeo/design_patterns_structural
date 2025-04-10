package decorator.example2;

public abstract class NotificadorDecorator implements Notificador {
    protected Notificador wrappee;

    public NotificadorDecorator(Notificador wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void enviar(String mensagem) {
        wrappee.enviar(mensagem);
    }
}