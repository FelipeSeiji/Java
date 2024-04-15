package Java;

import java.util.Locale;
import java.util.Scanner;

public class A10Repeticao_do_while {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;
        do{
            System.out.println("Digite a temperatura em Celsius: ");
            double C = sc.nextDouble();
            double F = C * 9/5 + 32;
            System.out.println(F);
            resp = sc.next().charAt(0);

        } while (resp != 'n');



        sc.close();
    }
}
