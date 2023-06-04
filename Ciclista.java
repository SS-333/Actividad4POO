package CarreraCiclistica;

public abstract class Ciclista implements ICiclista {
    private int identificador;
    private String nombre;
    private int tiempoAcumulado = 0;

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    abstract String imprimirTipo();
    @Override
    public int getId() {
        return identificador;
    }

    @Override
    public void setId() {
        this.identificador = identificador;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getPosicion(int posicionGeneral) {
        return posicionGeneral;
    }

    @Override
    public void setPosicion(int posicionGeneral) {
        posicionGeneral = posicionGeneral;
    }

    @Override
    public int getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    @Override
    public void setTiempoAcumulado(int tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    protected void imprimir(){
        System.out.println("Id: " + getId() +
                "Nombre: " + getNombre() +
                "Tiempo acumulado: " + getTiempoAcumulado());
    }
}
