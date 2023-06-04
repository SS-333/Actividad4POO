package Inmuebles;

public class LocalComercial extends Local {
    protected static double valorArea = 3000000;
    protected String centroComercial;

    public LocalComercial(int identificadorInmobiliario, float area, String direccion,
                          tipo tipoLocal, String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
        calcularPrecioVenta(valorArea);
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Centro comercial: " + centroComercial);
    }
}
