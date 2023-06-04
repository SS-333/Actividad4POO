package Inmuebles;

public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;

    public Apartaestudio(int identificadorInmobiliario, float area, String direccion,
                         int numeroHabitaciones, int numeroBanios) {
        super(identificadorInmobiliario, area, direccion, 1, 1);
        calcularPrecioVenta(valorArea);
    }

    @Override
    protected void imprimir() {
        System.out.println("\nDatos apartaestudio");
        super.imprimir();
    }
}
