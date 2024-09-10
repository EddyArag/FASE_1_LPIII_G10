package CuestionariosHechos;

// Implementación concreta de la estrategia de pago usando tarjeta de crédito.
// Esta clase implementa la interfaz EstrategiaPago.
public class PagoTarjeta implements EstrategiaPago {

    // Sobrescribe el método procesarPago de la interfaz EstrategiaPago.
    // Procesa el pago con tarjeta de crédito y muestra un mensaje indicando el
    // monto.
    @Override
    public void procesarPago(double monto) { // SobreEscribiendo el método procesarPago para pagos con tarjeta
        System.out.println("Procesando pago de " + monto + " con tarjeta de crédito");
    }
}
