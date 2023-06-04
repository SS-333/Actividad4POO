package CarreraCiclistica;

public class Velocista extends Ciclista{
    private double potenciaPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre,
                     double potenciaPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    protected void setPotenciaPromedio(double potenciaPromedio){
        this.potenciaPromedio = potenciaPromedio;
    }

    protected double getPotenciaPromedio(){
        return potenciaPromedio;
    }

    protected void setVelocidadPromedio(double velocidadPromedio){
        this.velocidadPromedio = velocidadPromedio;
    }
    protected  double getVelocidadPromedio(){
        return velocidadPromedio;
    }

    @Override
    String imprimirTipo() {
        return "Es un velocista";
    }

    @Override
    protected void imprimir() {
        super.imprimir();
        System.out.println("Potencia promedio: " + potenciaPromedio +
                "\nVelocidad promedio: " + velocidadPromedio);
    }
}
