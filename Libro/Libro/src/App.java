  public class App {
    public static void main(String[] args) {

        Libro libro1 = new Libro();

        Libro libro2 = new Libro(
                "Cien años de soledad",
                "Gabriel García Márquez");

        Libro libro3 = new Libro(
                "La voragine",
                "Jose Eustasio Rivera",
                false);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
        libro3.mostrarInfo();
    }
}