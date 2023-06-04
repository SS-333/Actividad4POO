package Animales;

public class Lobo extends Canido {
    Lobo() {
        setSonido("Aullido - auuuu");
        setHabitat("Bosque");
        setAlimentos("Carne - carnívoro");
        setNombreCientifico("Canis lupus");
    }

    void imprimirInfo() {
        System.out.println("\n" + getNombreCientifico() +
                " también conocido como Lobo" +
                "\nSonido: " + getSonido() +
                "\nSu habitat es: " + getHabitat() +
                "\nSu alimentación está basada en: " + getAlimentos());
    }
}
