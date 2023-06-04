package Animales;

public class Prueba {
    public static void main(String[] args) {
        Animal[] animales = new Animal[4];
        animales[0] = new Gato();
        animales[1] = new Perro();
        animales[2] = new Lobo();
        animales[3] = new Leon();
        for (Animal animale : animales) {
            animale.imprimirInfo();
            System.out.println();
        }
    }
}
