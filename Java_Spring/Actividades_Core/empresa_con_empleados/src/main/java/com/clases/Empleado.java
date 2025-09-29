package clases;

    public class Empleado {
        private String nombre;
        private int ID;
        private Double salarioBase;
        
        public Empleado(String nombre, int ID, Double salarioBase) {
            this.nombre = nombre;
            this.ID = ID;
            this.salarioBase = salarioBase;
        }

        public Double salarioTotal() {
            return salarioBase * 160;
        }
        public void despliegaInformacion() {
            System.out.println("Nombre: " + nombre + ", ID: " + ID + ", Salario: " + salarioTotal());
        }
}

