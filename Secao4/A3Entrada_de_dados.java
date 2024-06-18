package Java.Secao4;

import java.util.Scanner;

public class A3Entrada_de_dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Primeiro
        String x = sc.next();
        System.out.println("Voce digitou: " + x);

        //Segundo
        int y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        //Terceiro
        double z = sc.nextDouble();
        System.out.println("Voce digitou: " + z);

        //Quarto
        char a = sc.next().charAt(0);
        System.out.println(a);
        sc.close();
    }
}