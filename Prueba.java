package Inmuebles;

public class Prueba {
    public static void main(String[] args) {
        ApartamentoFamiliar apartamentoFamiliar = new ApartamentoFamiliar(103067, 120,
                "Avenida Santander 45-45", 3, 2, 200000);
        Apartaestudio apartaestudio = new Apartaestudio(12354, 50,
                "Avenida Caracas 30-15", 1, 1);
        CasaConjuntoCerrado miCasa = new CasaConjuntoCerrado(1, 250, "Calle siempre viva",
                4, 3, 2, 250000, true, true);
        apartamentoFamiliar.imprimir();
        apartaestudio.imprimir();
        miCasa.imprimir();
    }
}
