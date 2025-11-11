package Tarea;

// Clase base abstracta que define el contrato para calcular el pago
public abstract class Empleado {
    protected String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto que será implementado por las subclases
    public abstract double calcularPago();

    public String getNombre() {
        return nombre;
    }
}
