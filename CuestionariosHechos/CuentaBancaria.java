package CuestionariosHechos;

import java.util.*;

public class CuentaBancaria {
    private double saldo; // atributo privado de saldo

    public CuentaBancaria(double saldo) { // Constructor
        this.saldo = saldo;
    }

    // Metodo de retirar saldo
    public void retirar(double monto) throws Exception { // EXECPCION
        if (monto > saldo) {
            throw new Exception("Saldo insuficiente.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }

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
    }
}
