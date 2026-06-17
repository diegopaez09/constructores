public class DepositoAgua {
    private double capacidad;
    private double volumenActual;
    private DepositoAgua depositoDesborde;

    // Constructor vacío
    public DepositoAgua() {
    }

    // Constructor con capacidad
    public DepositoAgua(double capacidad) {
        this.capacidad = capacidad;
        this.volumenActual = 0;
        this.depositoDesborde = null;
    }

    // Constructor completo
    public DepositoAgua(double capacidad, double volumenActual) {
        this.capacidad = capacidad;
        this.volumenActual = volumenActual;
        this.depositoDesborde = null;
    }

    public void setDepositoDesborde(DepositoAgua depositoDesborde) {
        this.depositoDesborde = depositoDesborde;
    }

    public void agregarAgua(double cantidad) {
        volumenActual += cantidad;

        if (volumenActual > capacidad && depositoDesborde != null) {
            double exceso = volumenActual - capacidad;
            volumenActual = capacidad;
            depositoDesborde.agregarAgua(exceso);
        }
    }

    public void mostrarInfo() {
        System.out.println("Capacidad: " + capacidad);
        System.out.println("Volumen actual: " + volumenActual);
        System.out.println();
    }
}