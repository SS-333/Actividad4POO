package Inmuebles;

public class Casa extends InmuebleVivienda {
    protected int numeroPisos;

    Casa(int identificadorInmobiliario, float area, String direccion,
         int numeroHabitaciones, int numeroBanios, int numeroPisos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanios);
        this.numeroPisos = numeroPisos;
    }

    void imprimir() {
        super.imprimir();
        System.out.println("Número de pisos: " + numeroPisos);
    }
}
