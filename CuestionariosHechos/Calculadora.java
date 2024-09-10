package CuestionariosHechos;

// Clase Calculadora que utiliza el patrón Strategy para realizar operaciones aritméticas.
public class Calculadora {

    // Atributo de tipo Operacion, que representa una estrategia de operación
    // aritmética.
    public Operacion operacion;

    // Constructor que inicializa la calculadora con una implementación específica
    // de Operacion.
    public Calculadora(Operacion operacion) {
        this.operacion = operacion;
    }

    // Método calcular que ejecuta la operación específica (suma, resta, etc.) con
    // los operandos a y b.
    // El comportamiento de este método dependerá de la estrategia (implementación
    // de Operacion) proporcionada.
    public double calcular(double a, double b) {
        return operacion.operar(a, b);
    }
}
