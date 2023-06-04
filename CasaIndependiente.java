package Inmuebles;

public class CasaIndependiente extends Casa {

    protected static double valorArea = 3000000;

    public CasaIndependiente(int identificadorInmobiliario, float area, String direccion,
                             int numeroHabitaciones, int numeroBanios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones,
                numeroBanios, numeroPisos);

        calcularPrecioVenta(valorArea);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}
