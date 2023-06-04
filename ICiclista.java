package CarreraCiclistica;

public interface ICiclista {
    int getId();
    void setId();
    String getNombre();
    void setNombre(String nombre);
    int getPosicion(int posicionGeneral);
    void setPosicion(int posicionGeneral);
    int getTiempoAcumulado();
    void setTiempoAcumulado(int tiempoAcumulado);

}
