package bridge.example2;

public class MensagemDeConfirmacao extends Mensagem {
    public MensagemDeConfirmacao(CanalDeEnvio canal) {
        super(canal);
    }

    @Override
    public void enviarMensagem(String texto) {
        canal.enviar("CONFIRMAÇÃO: " + texto);
    }
}