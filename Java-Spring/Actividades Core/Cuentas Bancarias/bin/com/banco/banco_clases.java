import java.util.ArrayList;

public class banco_clases {

    private String nombre;
    private int edad;

    public banco_clases(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void despliegaInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

}

class CuentaBancaria {
    private double saldo;
    private banco_clases titular;
    private int numeroCuenta;
    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    public CuentaBancaria(double saldo, banco_clases titular, int numeroCuenta) {
        this.saldo = saldo;
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        listaDeCuentasBancarias.add(this);
    }

    public double getSaldo() {
        return saldo;
    }
    public banco_clases getTitular() {
        return titular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setTitular(banco_clases titular) {
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
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
            System.out.println("-------------------");
        }
    }
}