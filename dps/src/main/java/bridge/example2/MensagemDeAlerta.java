package bridge.example2;

public class MensagemDeAlerta extends Mensagem {
    public MensagemDeAlerta(CanalDeEnvio canal) {
        super(canal);
    }

    @Override
    public void enviarMensagem(String texto) {
        canal.enviar("ALERTA: " + texto);
    }
}