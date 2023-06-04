package Inmuebles;

public abstract class InmuebleVivienda extends Inmueble {
    private int numeroHabitaciones;
    private int numeroBanios;

    InmuebleVivienda(int identificadorInmobiliario, float area, String direccion,
                     int numeroHabitaciones, int numeroBanios) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBanios = numeroBanios;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones: " + numeroHabitaciones +
                "\nNúmero de baños: " + numeroBanios);
    }
}
