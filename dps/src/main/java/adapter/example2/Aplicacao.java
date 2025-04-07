package adapter.example2;

public class Aplicacao {
    public static void main(String[] args) {
        LoggerAntigo legado = new LoggerAntigo();
        Logger logger = new LoggerAdapter(legado);

        logger.log("Nova aplicação usando sistema de log antigo.");
    }
}