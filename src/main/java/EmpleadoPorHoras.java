class EmpleadoPorHoras extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double salarioPorHora, int horasTrabajadas) {
        super(nombre, 0); // Inicializamos el salarioBase en 0
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}