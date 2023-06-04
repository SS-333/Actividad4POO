package Herencia;

public class CuentaCorriente extends Cuenta{
    protected float sobregiro = 0;

    // constructor
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }

    @Override
    protected void consignar(float consignacion) {
        float residuo = sobregiro - consignacion;
        if(sobregiro > 0){
            if(residuo > 0){
                sobregiro = 0;
                saldo = residuo;
            }
            else {
                sobregiro -= residuo;
                saldo = 0;
            }
        }
        else {
            super.consignar(consignacion);
        }
    }

    @Override
    protected void retirar(float retiro) {
        float transaccion = saldo - retiro;
        if(transaccion < 0 ){
            sobregiro -= transaccion;
            saldo = 0;
            numeroRetiros += 1;
        }
        else{
            super.retirar(retiro);
        }
    }

    @Override
    protected void generarExtracto() {
        super.generarExtracto();
    }

    protected void imprimir(){
        System.out.println("Tu saldo es: $" + saldo +
                "\nComisión mensual: $" + comisionMensual +
                "\nNúmero de transacciones: " + (numeroConsignaciones+numeroRetiros) +
                "\nSobregiro: $" + sobregiro);
    }
}
