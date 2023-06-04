package Animales;

public class Leon extends Felino {

    Leon() {
        setSonido("Rugido - grrr");
        setHabitat("Pradera");
        setAlimentos("Carne - carnívoro");
        setNombreCientifico("Panthera leo");
    }

    void imprimirInfo() {
        System.out.println("\n" + getNombreCientifico() +
                " también conocido como Leónsitooo" +
                "\nSonido: " + getSonido() +
                "\nSu habitat es: " + getHabitat() +
                "\nSu alimentación está basada en: " + getAlimentos());
    }
}
