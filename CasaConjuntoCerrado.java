package Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {
    protected static double valorArea = 2500000;
    protected double valorAdministracion;
    protected boolean tienePiscina;
    protected boolean tieneEspaciosDeportivos;

    public CasaConjuntoCerrado(int identificadorInmobiliario, float area, String direccion,
                               int numeroHabitaciones, int numeroBanios, int numeroPisos,
                               double valorAdministracion, boolean tienePiscina, boolean tieneEspaciosDeportivos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios, numeroPisos);
        this.valorAdministracion = valorAdministracion;
        this.tieneEspaciosDeportivos = tieneEspaciosDeportivos;
        this.tienePiscina = tienePiscina;
        calcularPrecioVenta(valorArea);
    }

    @Override
    public void imprimir() {
        System.out.println("\nDatos casa");
        super.imprimir();
        System.out.println("Valor cuota administración: $" + valorAdministracion +
                "\n¿Cuenta con espacios deportivos? " + (tieneEspaciosDeportivos ? "Sí" : "No") +
                "\n¿Cuenta con piscina? " + (tienePiscina ? "Sí\n" : "No\n"));
    }
}
