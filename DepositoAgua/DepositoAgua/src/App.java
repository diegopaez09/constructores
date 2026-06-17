public class App {
    public static void main(String[] args) {

        DepositoAgua deposito1 = new DepositoAgua(100, 50);
        DepositoAgua deposito2 = new DepositoAgua(50);

        deposito1.setDepositoDesborde(deposito2);

        deposito1.agregarAgua(80);

        deposito1.mostrarInfo();
        deposito2.mostrarInfo();
    }
}