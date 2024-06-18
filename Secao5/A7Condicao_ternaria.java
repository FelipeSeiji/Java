package Java.Secao5;

import java.util.Scanner;

public class A7Condicao_ternaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto = (preco < 20) ? preco*0.1 : preco * 0.05;
        sc.close();
        System.out.println(desconto);
    }
}
