import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();

        // Crear instancias de EmpleadoAsalariado y EmpleadoPorHoras y agregarlas a la lista
        Empleado empleado1 = new EmpleadoAsalariado("Juan Perez", 2000);
        Empleado empleado2 = new EmpleadoPorHoras("Maria Rodriguez", 15, 40);

        empleados.add(empleado1);
        empleados.add(empleado2);

        // Calcular y mostrar los salarios de los empleados
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("--------------------");
        }
    }
}