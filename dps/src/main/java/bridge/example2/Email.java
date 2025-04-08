package bridge.example2;

public class Email implements CanalDeEnvio {
    @Override
    public void enviar(String conteudo) {
        System.out.println("Enviando por Email: " + conteudo);
    }
}