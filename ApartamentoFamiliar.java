package Inmuebles;

public class ApartamentoFamiliar extends Apartamento {
    protected static double valorArea = 2000000;
    protected double valorAdministracion;

    public ApartamentoFamiliar(int identificadorInmobiliario, float area, String direccion,
                               int numeroHabitaciones, int numeroBanios, double valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios);
        this.valorAdministracion = valorAdministracion;
        calcularPrecioVenta(valorArea);
    }

    @Override
    protected void imprimir() {
        System.out.println("\nDatos apartamento");
        super.imprimir();
        System.out.println("Valor cuota administración: $" + valorAdministracion);
    }
}
