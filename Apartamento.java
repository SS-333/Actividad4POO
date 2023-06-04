package Inmuebles;

public class Apartamento extends InmuebleVivienda {
    Apartamento(int identificadorInmobiliario, float area, String direccion,
                int numeroHabitaciones, int numeroBanios) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios);

    }

    @Override
    protected void imprimir() {
        super.imprimir();
    }
}
