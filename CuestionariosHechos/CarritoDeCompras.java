package CuestionariosHechos;

// Clase CarritoDeCompras que utiliza el patrón Strategy para procesar el pago de una compra.
public class CarritoDeCompras {

    // Atributo de tipo EstrategiaPago, que representa la estrategia de pago a
    // utilizar.
    public EstrategiaPago estrategiaPago;

    // Constructor que inicializa el carrito con una implementación específica de
    // EstrategiaPago.
    public CarritoDeCompras(EstrategiaPago estrategiaPago) {
        this.estrategiaPago = estrategiaPago;
    }

    // Método procesarCompra que realiza el pago de la compra utilizando la
    // estrategia de pago proporcionada.
    // El monto de la compra se pasa como argumento y la forma de procesar el pago
    // dependerá de la estrategia implementada.
    public void procesarCompra(double monto) {
        estrategiaPago.procesarPago(monto);
    }
}
