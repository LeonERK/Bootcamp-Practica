package clases;
import java.util.ArrayList;

public class cuentaBancaria {
    private double saldo;
    private bancoClases titular;
    private int numeroCuenta;
    private static ArrayList<cuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    public cuentaBancaria(double saldo, bancoClases titular, int numeroCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        listaDeCuentasBancarias.add(this);
    }

    public double getSaldo() {
        return saldo;
    }
    public bancoClases getTitular() {
        return titular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(bancoClases titular) {
        this.titular = titular;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
        }
    }

    public void despliegaInformacion() {
        System.out.println("Número de cuenta: " + numeroCuenta + ", Saldo: " + saldo);
        titular.despliegaInformacion();
    }

    public static void imprimeInformacionDeTodasLasCuentas() {
        for (cuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("-------------------");
        }
    }
}

