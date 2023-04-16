import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main2(String[] args) {
        Logger logger = Logger.getInstance("ERROR");
        Golondrina pepita = new Golondrina(2, "Pepita");
        Golondrina pepon = new Golondrina(1, "Pepón");
        logger = Logger.getInstance("INFO");
        Paloma bombon = new Paloma("Bombón");
        System.out.println("Pepita recorrió " + pepita.getDistanciaRecorrida() + " kms.");
        pepita.comer(5);
        pepita.volar(1);
        pepita.comer(20);
        pepita.volar(2);
        System.out.println("Pepita recorrió " + pepita.getDistanciaRecorrida() + " kms.");
        System.out.println("Energía de Pepita: " + pepita.getEnergia());
        System.out.println("Energía de Pepón: " + pepon.getEnergia());
        pepita.pescar();
        pepon.pescar();
        System.out.println("Energía de Pepita: " + pepita.getEnergia());
        System.out.println("Energía de Pepón: " + pepon.getEnergia());
        pepita.pescar();
        pepon.pescar();
        System.out.println("Energía de Pepita: " + pepita.getEnergia());
        System.out.println("Energía de Pepón: " + pepon.getEnergia());
        System.out.println("Energía de Bombón: " + bombon.getEnergia());
        bombon.defecar();
        System.out.println("Energía de Bombón: " + bombon.getEnergia());
    }

    public static void main(String[] args) {
        Logger.getInstance("INFO");
        Mariposa twinkle = new Mariposa("Twinkle");
        Golondrina pepita = new Golondrina(2, "Pepita");
        Golondrina pepon = new Golondrina(1, "Pepón");
        Paloma bombon = new Paloma("Bombón");
        ArrayList<Voladores> lista = new ArrayList<Voladores>() {{add(twinkle); add(pepita); add(pepon); add(bombon);}};
        lista.forEach(voladores -> voladores.comer(20));
        lista.forEach(voladores -> voladores.volar(2));
        lista.forEach(voladores -> voladores.comer(10));
        lista.forEach(voladores -> voladores.volar(3));
        lista.forEach(Voladores::getDistanciaRecorrida);
    }
}
