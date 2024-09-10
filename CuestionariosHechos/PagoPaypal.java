package CuestionariosHechos;

// Implementación concreta de la estrategia de pago usando PayPal.
// Esta clase implementa la interfaz EstrategiaPago.
public class PagoPaypal implements EstrategiaPago {

    // Sobrescribe el método procesarPago de la interfaz EstrategiaPago.
    // Procesa el pago con la plataforma PayPal y muestra un mensaje indicando el
    // monto.
    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con PayPal");
    }
}
