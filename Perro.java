package Animales;

public class Perro extends Canido {
    Perro() {
        setSonido("Ladrido - Woff, woff");
        setHabitat("Doméstico");
        setAlimentos("Carne - carnívoro");
        setNombreCientifico("Canis lupus familiaris");
    }

    void imprimirInfo() {
        System.out.println("\n" + getNombreCientifico() +
                " también conocido como Perro o  can" +
                "\nSonido: " + getSonido() +
                "\nSu habitat es: " + getHabitat() +
                "\nSu alimentación está basada en: " + getAlimentos());
    }
}
