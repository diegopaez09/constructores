public class Vuelo {
    private String numero;
    private String origen;
    private String destino;
    private int ocupacion;
    private int capacidadMaxima;


    public Vuelo() {
    }

    
    public Vuelo(String numero, String origen, String destino) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = 0;
    }

    
    public Vuelo(String numero, String origen, String destino,
                 int ocupacion, int capacidadMaxima) {
        this.numero = numero;
        this.origen = origen;
        this.destino = destino;
        this.ocupacion = ocupacion;
        this.capacidadMaxima = capacidadMaxima;
    }

    public void embarcar() {
        if (ocupacion < capacidadMaxima) {
            ocupacion++;
        }
    }

    public void desembarcar() {
        if (ocupacion > 0) {
            ocupacion--;
        }
    }

    public void mostrarInfo() {
        System.out.println("Número: " + numero);
        System.out.println("Origen: " + origen);
        System.out.println("Destino: " + destino);
        System.out.println("Ocupación: " + ocupacion);
        System.out.println("Capacidad máxima: " + capacidadMaxima);
        System.out.println();
    }
}