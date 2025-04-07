package adapter.example2;

public class LoggerAdapter implements Logger {
    private LoggerAntigo loggerAntigo;

    public LoggerAdapter(LoggerAntigo loggerAntigo) {
        this.loggerAntigo = loggerAntigo;
    }

    @Override
    public void log(String mensagem) {
        // Adapta a chamada do novo sistema para o método do legado
        loggerAntigo.escrever(mensagem);
    }
}