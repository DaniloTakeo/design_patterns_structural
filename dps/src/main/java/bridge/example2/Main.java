package bridge.example2;

public class Main {
    public static void main(String[] args) {
        CanalDeEnvio email = new Email();
        CanalDeEnvio sms = new SMS();

        Mensagem alertaPorEmail = new MensagemDeAlerta(email);
        Mensagem confirmacaoPorSMS = new MensagemDeConfirmacao(sms);

        alertaPorEmail.enviarMensagem("Servidor fora do ar");
        confirmacaoPorSMS.enviarMensagem("Cadastro realizado com sucesso");
    }
}