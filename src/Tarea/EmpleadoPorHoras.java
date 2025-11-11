package Tarea;

// Subclase que representa a un empleado que cobra por horas trabajadas
public class EmpleadoPorHoras extends Empleado {
    private double tarifaHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double tarifaHora, int horasTrabajadas) {
        super(nombre);
        this.tarifaHora = tarifaHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación específica del cálculo de pago
    @Override
    public double calcularPago() {
        return tarifaHora * horasTrabajadas;
    }
}
