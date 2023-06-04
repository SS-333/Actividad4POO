package CarreraCiclistica;

public class Escalador extends Ciclista{
    private double aceleracionPromedio;
    private double gradoRampa;

    public Escalador(int identificador, String nombre,
                     double aceleracionPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampa = gradoRampa;
    }

    protected void setAceleracionPromedio(double aceleracionPromedio){
        this.aceleracionPromedio = aceleracionPromedio;
    }

    protected double getAceleracionPromedio(){
        return aceleracionPromedio;
    }

    protected void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    protected double getGradoRampa() {
        return gradoRampa;
    }

    protected void imprimir() {
        super.imprimir(); // Invoca el método imprimir de la clase padre
        System.out.println("Aceleración promedio: " + aceleracionPromedio +
                "\nGrado de rampa: " + gradoRampa);
    }
    @Override
    String imprimirTipo() {
        return "Es un escalador";
    }
}
