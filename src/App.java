public class App {
    public static void main(String[] args) throws Exception {
        Recursividad rc = new Recursividad();
        System.out.println(rc.fibonacci(3));

        RenombrarDirectorios rd = new RenombrarDirectorios();
        rd.renombrarDirectorios("src/directorio");
    }
}
