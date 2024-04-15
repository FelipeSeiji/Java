package Java.A13Membros_estaticos.application;

import java.util.Locale;
import java.util.Scanner;

import Java.A13Membros_estaticos.util.Calculetor;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = sc.nextDouble();
        
        double c = Calculetor.circumference(radius);

        double v = Calculetor.volume(radius);

        System.out.printf("Circufenrence: %.2f%n",c);

        System.err.printf("Volume: %.2f%n", v);

        sc.close();
    }

}

