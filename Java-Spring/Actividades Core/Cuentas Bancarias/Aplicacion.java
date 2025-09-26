import com.miempresa.banco_clases;
import com.miempresa.CuentaBancaria;
import java.util.ArrayList;


public class Aplicacion {

    public static void main(String[] args) {
        banco_clases cliente1 = new banco_clases("Juan Perez", 30);
        banco_clases cliente2 = new banco_clases("Maria Gomez", 25);

        CuentaBancaria cuenta1 = new CuentaBancaria(1000.0, cliente1, 12345);
        CuentaBancaria cuenta2 = new CuentaBancaria(2000.0, cliente2, 67890);

        cuenta1.depositar(500.0);
        cuenta2.retirar(1000.0);

        CuentaBancaria.imprimeInformacionDeTodasLasCuentas();
    }

}
