package clases;

public class Gerente extends Empleado {
    private Double bono;

    public Gerente(String nombre, int ID, Double salarioBase, Double bono) {
        super(nombre, ID, salarioBase);
        this.bono = bono;
    }

    @Override
    public Double salarioTotal() {
        return super.salarioTotal() + bono;
    }

    @Override
    public void despliegaInformacion() {
        super.despliegaInformacion();
        System.out.println("Bono: " + bono);
    }
}
