public class Logger {

    private static Logger instancia;

    private int contador = 0;

    // constructor privado:nadie puede hacer "new Logger()" desde afuera
    private Logger() {
        System.out.println(">> Se creó el Logger");
    }

    public static Logger getInstance() {
        if (instancia == null) {
            instancia = new Logger();
        }
        return instancia;
    }

    public void log(String mensaje) {
        contador++;
        System.out.println("[LOG " + contador + "] " + mensaje);
    }
}