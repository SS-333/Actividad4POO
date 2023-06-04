package Herencia;

import org.*;

import java.util.*;

public abstract class Cuenta {
    // atributos
    protected float saldo;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;

    HashMap<String, String> data = new HashMap<>();

    // constructor
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual / 100;
    }

    protected void consignar(float consignacion) {
        if (consignacion > 0) {
            numeroConsignaciones += 1;
            saldo += consignacion;
        }
    }

    protected void retirar(float retiro) {
        if(retiro > 0){
            if (saldo - retiro < 0) {
                System.out.println("El saldo es insuficiente");
            } else if (saldo - retiro > 0) {
                saldo -= retiro;
                numeroRetiros += 1;
            }
        }
    }

    protected void calcularInteresMensual() {
        saldo += saldo * (tasaAnual / 12);
    }

    protected void generarExtracto() {
        saldo -= comisionMensual;
        calcularInteresMensual();
    }

    private void settearDatos() {
        data.put("Saldo", String.valueOf(saldo));
        data.put("Número de consignaciones", String.valueOf(numeroConsignaciones));
        data.put("Número de retiros", String.valueOf(numeroRetiros));
        data.put("Comisión mensual", String.valueOf(comisionMensual));
        data.put("Tasa anual", String.valueOf(tasaAnual/100));
    }

    protected void imprimir() {
        settearDatos();
        JSONObject json = new JSONObject(data);
        System.out.println(json);
    }
}
