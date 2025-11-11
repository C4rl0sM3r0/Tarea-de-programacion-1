package Tarea;

// Subclase que representa a un empleado con salario fijo mensual
public class EmpleadoAsalariado extends Empleado {
    private double salarioMensual;

    public EmpleadoAsalariado(String nombre, double salarioMensual) {
        super(nombre); // Llama al constructor de la clase base
        this.salarioMensual = salarioMensual;
    }

    // Implementación específica del cálculo de pago
    @Override
    public double calcularPago() {
        return salarioMensual;
    }
}
