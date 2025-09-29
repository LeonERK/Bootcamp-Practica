package clases;

public class Director extends Gerente {
    private Double acciones;

    public Director(String nombre, int ID, Double salarioBase, Double bono, Double acciones) {
        super(nombre, ID, salarioBase, bono);
        this.acciones = acciones;
    }

    @Override
    public Double salarioTotal() {
        return super.salarioTotal() + acciones;
    }

    @Override
    public void despliegaInformacion() {
        super.despliegaInformacion();
        System.out.println("Acciones: " + acciones);
    }
}
