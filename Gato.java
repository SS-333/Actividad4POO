package Animales;

public class Gato extends Felino {
    Gato() {
        setSonido("Maullido - meow");
        setHabitat("Doméstico");
        setAlimentos("Carne, Ratones - carnívoro");
        setNombreCientifico("Felis silvestris catus");
    }

    void imprimirInfo() {
        System.out.println("\n" + getNombreCientifico() + " también conocido como Gato"
                + "\nSonido: " + getSonido()
                + "\nSu habitat es: " + getHabitat()
                + "\nSu alimentación está basada en: " + getAlimentos());
    }
}
