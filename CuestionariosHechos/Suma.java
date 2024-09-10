package CuestionariosHechos;

public class Suma implements Operacion {
    @Override // reescribe el metodo operacion en Suma
    public double operar(double a, double b) {
        return a + b;
    }

}