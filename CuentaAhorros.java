package Herencia;

public class CuentaAhorros extends  Cuenta{
    private boolean isActiva;
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        isActiva = !(saldo < 10000);
    }
    protected void consignar(float consignacion) {
        if(isActiva){
            super.consignar(consignacion);
        }
    }
    protected void retirar(float retiro) {
        if(isActiva){
            super.retirar(retiro);
        }
    }
    protected void generarExtractoMensual() {
        if(numeroRetiros > 4){
           comisionMensual += (numeroRetiros - 4) * 1000;
        }
        super.generarExtracto();
        if (saldo < 10000) {
            isActiva = false;
        }
    }
    protected void imprimir(){
        System.out.println("Tu saldo es: $" + saldo +
                "\nComisión mensual: $" + comisionMensual +
                "\nNúmero de transacciones: " + (numeroConsignaciones+numeroRetiros));
    }
}
