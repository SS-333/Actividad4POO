package Inmuebles;

public class Oficina extends Local {
    protected static double valorArea = 3500000;
    protected boolean esGubernamental;

    public Oficina(int identificadorInmobiliario, float area, String direccion,
                   tipo tipoLocal, boolean esGubernamental) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.esGubernamental = esGubernamental;
        calcularPrecioVenta(valorArea);
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Es gubernamental: " + (esGubernamental ? "Sí.\n" : "No.\n"));
    }
}
