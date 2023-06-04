package Animales;

public abstract class Animal implements IAnimal{
    private String sonido;
    private String alimentos;
    private String habitat;
    private String nombreCientifico;

    @Override
    public void setNombreCientifico(String nombre) {
        this.nombreCientifico = nombre;
    }

    @Override
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    @Override
    public void setAlimentos(String alimento) {
        this.alimentos = alimento;
    }

    @Override
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    @Override
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    @Override
    public String getSonido() {
        return sonido;
    }

    @Override
    public String getAlimentos() {
        return alimentos;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    abstract void imprimirInfo();
}
