public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible;

   
    public Libro() {
        disponible = true;
    }


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }

    
    public Libro(String titulo, String autor, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Disponible: " + disponible);
        System.out.println();
    }
}