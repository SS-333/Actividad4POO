package Inmuebles;

public class CasaRural extends Casa {
    protected static double valorArea = 1500000;
    protected double distanciaCabecera;
    protected double altitud;

    public CasaRural(int identificadorInmobiliario, float area, String direccion,
                     int numeroHabitaciones, int numeroBanios, int numeroPisos, int distanciaCabecera,
                     int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios, numeroPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altitud = altitud;
        calcularPrecioVenta(valorArea);
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal: " + distanciaCabecera + " km" +
                "\nAltitud sobre el nivel del mar: " + altitud + " mts.\n");
    }
}
