import clases.bancoClases;
import clases.cuentaBancaria;


public class Aplicacion {

    public static void main(String[] args) {
        bancoClases cliente1 = new bancoClases("Juan Perez", 30);
        bancoClases cliente2 = new bancoClases("Maria Gomez", 25);
        bancoClases cliente3 = new bancoClases("Carlos Sanchez", 40);

        cuentaBancaria cuenta1 = new cuentaBancaria(1222.0, cliente1, 12345);
        cuentaBancaria cuenta2 = new cuentaBancaria(2200.0, cliente2, 67890);
        cuentaBancaria cuenta3 = new cuentaBancaria(5000.0, cliente3, 11223);

        cuenta1.depositar(500.0);
        System.out.println("Saldo cuenta 1: " + cuenta1.getSaldo());
        cuenta2.retirar(1000.0);
        System.out.println("Saldo cuenta 2: " + cuenta2.getSaldo());
        cuenta3.retirar(4500.0);
        System.out.println("Saldo cuenta 3: " + cuenta3.getSaldo());

        cuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }

}
