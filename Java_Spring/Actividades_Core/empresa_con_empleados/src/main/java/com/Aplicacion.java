import clases.Empleado;
import clases.Gerente;
import clases.Director;

public class Aplicacion {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Fernanda", 1, 3000.0);
        Gerente gerente = new Gerente("Alex", 2, 5000.0, 1000.0);
        Director director = new Director("Fitzgerald", 3, 7000.0, 2000.0, 1500.0);

        empleado.despliegaInformacion();
        System.out.println("---");
        gerente.despliegaInformacion();
        System.out.println("---");
        director.despliegaInformacion();
    }
}