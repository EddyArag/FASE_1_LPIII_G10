package CuestionariosHechos;

public class Resta implements Operacion {
    @Override // reescriber el metodo operacion para resta
    public double operar(double a, double b) {
        return a - b;
    }

}