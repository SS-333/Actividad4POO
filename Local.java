package Inmuebles;

public class Local extends Inmueble {
    enum tipo {interno, calle}
    protected tipo tipoLocal;
    public Local(int identificadorInmobiliario, float area, String direccion, tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    @Override
    void imprimir() {
        super.imprimir();
        System.out.println("Tipo de local: " + tipoLocal);
    }
}
