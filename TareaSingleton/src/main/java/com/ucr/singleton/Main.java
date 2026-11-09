public class Main {
    public static void main(String[] args) {
        Logger a = Logger.getInstance();
        Logger b = Logger.getInstance();

        a.log("Arrancó el sistema");
        new ServicioUser().login("Sebas");
        b.log("Se cerró el sistema");

        System.out.println("¿a == b? " + (a == b));
    }
}