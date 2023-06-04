package Inmuebles;

public class CasaUrbana extends Casa {
    public CasaUrbana(int identificadorInmobiliario, float area, String direccion,
                      int numeroHabitaciones, int numeroBanios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones,
                numeroBanios, numeroPisos);
    }

    @Override
    void imprimir() {
        super.imprimir();
    }
}
