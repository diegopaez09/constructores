public class App {
    public static void main(String[] args) {

        Vuelo vuelo1 = new Vuelo();

        Vuelo vuelo2 = new Vuelo(
                "1",
                    "Bogotá",
                "Medellín");

        Vuelo vuelo3 = new Vuelo(
                "2",
                "Bogotá",
                "Cali",
                50,
                100);

        vuelo1.mostrarInfo();
        vuelo2.mostrarInfo();
        vuelo3.mostrarInfo();

        vuelo3.embarcar();
        vuelo3.desembarcar();

        vuelo3.mostrarInfo();
    }
}