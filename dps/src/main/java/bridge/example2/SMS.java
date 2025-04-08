package bridge.example2;

public class SMS implements CanalDeEnvio {
    @Override
    public void enviar(String conteudo) {
        System.out.println("Enviando por SMS: " + conteudo);
    }
}