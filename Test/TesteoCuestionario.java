package Test;

import CuestionariosHechos.*;
import java.util.*;

public class TesteoCuestionario {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        try { // INTENTO
            System.out.println("Ingrese el saldo:");
            double saldo = entrada.nextDouble();
            CuentaBancaria cuenta = new CuentaBancaria(saldo); // Creacion del objeto Cuenta

            System.out.print("Ingrese el monto a retirar: ");
            double monto = entrada.nextDouble();

            cuenta.retirar(monto); // llamado de la funcion
        } catch (InputMismatchException e) { // Excepcion atrapada en caso de no ingresar numeros
            System.out.println("Error: Entrada no válida, por favor ingrese números.");
        } catch (Exception e) { // excepcion propia de nuestro metodo
            System.out.println("Error: " + e.getMessage());
        } finally { // finally para cerrar el scanner siempre
            entrada.close();
        }

        // Usamos la estrategia de Suma
        Calculadora calculadoraSuma = new Calculadora(new Suma());
        System.out.println("Suma de 5.5 y 3.3: " + calculadoraSuma.calcular(5.5, 3.3));

        // Usamos la estrategia de Resta
        Calculadora calculadoraResta = new Calculadora(new Resta());
        System.out.println("Resta de 5.5 y 3.3: " + calculadoraResta.calcular(5.5, 3.3));
        CarritoDeCompras carritoConTarjeta = new CarritoDeCompras(new PagoTarjeta());
        carritoConTarjeta.procesarCompra(100.0);

        CarritoDeCompras carritoConPayPal = new CarritoDeCompras(new PagoPaypal());
        carritoConPayPal.procesarCompra(200.0);
    }
}
