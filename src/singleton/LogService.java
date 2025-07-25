package singleton;

public class LogService {

    private static LogService instancia;

    private LogService() {
        // Construtor privado
    }

    public static LogService getInstance() {
        if (instancia == null) {
            instancia = new LogService();
        }
        return instancia;
    }

    public void registrar(String mensagem) {
        System.out.println("[LOG]: " + mensagem);
    }
}

