import Figuras.Circulo;
import Figuras.Cuadrado;
import Operaciones.Calculadora;
import Zoologico.Animal;
import Zoologico.Gato;
import Zoologico.Perro;
import Tarea.Empleado;
import Tarea.EmpleadoAsalariado;
import Tarea.EmpleadoPorHoras;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Ejercicio con Polimorfismo"));

    Calculadora c1 = new Calculadora();

    System.out.printf("\nla suma de 10+23 es %d", c1.suma(10,23));
    System.out.printf("\nla suma de 10+23 es %d", c1.suma(10,23,10));
    int[] numeros = {3,9,5,10,12,1,29,60};
    System.out.printf("\nla suma de array %d", c1.suma(numeros));
    System.out.printf("\nla suma de array %.2f", c1.suma(34.56,10.33));

    Animal a = new Animal();
    a.hacerSonido();


    Perro p1 = new Perro();
    p1.hacerSonido();

    Gato tom = new Gato();
    tom.hacerSonido();

    Cuadrado cuadrado = new Cuadrado();
    cuadrado.dibujar();

    Circulo circulo = new Circulo();
    circulo.dibujar();

    Empleado[] empleadossdf = new Empleado[3];
    empleadossdf[0] = new EmpleadoAsalariado("\nCarlos", 350);
    empleadossdf[1] = new EmpleadoPorHoras("Johana", 20, 11);
    empleadossdf[2] = new EmpleadoPorHoras("Jhony", 10, 21);

    for (Empleado emp : empleadossdf) {
        System.out.printf("Empleado: %s , su pago es: $%.2f\n", emp.getNombre(), emp.calcularPago());
    }



}