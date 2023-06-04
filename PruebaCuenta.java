package Herencia;

import java.util.*;

public class PruebaCuenta {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        System.out.println(menu());
        while (run) {
            switch (input.nextLine()) {
                case "1" -> {
                    cuentaAhorros();
                    System.out.println(menu());
                }
                case "2" -> {
                    cuentaCorriente();
                    System.out.println(menu());
                }
                case "3" -> {
                    run = false;
                }
            }
        }
    }
    static String menu() {
        return "\nBienvenido, ingrese su tipo de cuenta: \n1. Cuenta de ahorros\n2. Cuenta corriente\n3. Cancelar";
    }

    static void cuentaAhorros() {
        System.out.println("\nCuenta de ahorros");
        System.out.print("Ingrese saldo inicial: $");
        float saldoInicialAhorros = input.nextFloat();
        System.out.print("Ingrese tasa de interés (10 -> 10%): ");
        float tasaAhorros = input.nextFloat();
        CuentaAhorros cuentaAhorros = new
                CuentaAhorros(saldoInicialAhorros, tasaAhorros);
        System.out.print("Ingresar cantidad a consignar: $");
        float cantidadDepositar = input.nextFloat();
        cuentaAhorros.consignar(cantidadDepositar);
        System.out.print("Ingresar cantidad a retirar: $");
        float cantidadRetirar = input.nextFloat();
        cuentaAhorros.retirar(cantidadRetirar);
        cuentaAhorros.generarExtractoMensual();
        cuentaAhorros.imprimir();
    }

    static void cuentaCorriente() {
        System.out.println("\nCuenta corriente");
        System.out.print("Ingrese saldo inicial: $");
        float saldoInicialCorriente = input.nextFloat();
        System.out.print("Ingrese tasa de interés (10 -> 10%): ");
        float tasaCorriente = input.nextFloat();
        CuentaCorriente cuentaCorriente = new
                CuentaCorriente(saldoInicialCorriente, tasaCorriente);
        System.out.print("Ingresar cantidad a consignar: $");
        float deposito = input.nextFloat();
        cuentaCorriente.consignar(deposito);
        System.out.print("Ingresar cantidad a retirar: $");
        float retiro = input.nextFloat();
        cuentaCorriente.retirar(retiro);
        cuentaCorriente.generarExtracto();
        cuentaCorriente.imprimir();
    }
}