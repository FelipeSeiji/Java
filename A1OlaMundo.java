package Java;

import java.util.Locale;

public class A1OlaMundo {
    public static void main(String[] args) {
        //Primeiro 
        System.out.println("Ola Mundo");
        System.out.println("Bom dia");
        
        //Segundo
        int y = 32;
        System.out.println(y);

        //Terceiro
        double x = 10.35784;
        System.out.println("x");
        System.out.printf("%.2f%n",x);

        //Quarto
        Locale.setDefault(Locale.US);
        System.out.printf("%4f%n",x);

        //Quinto
        System.out.println("RESULTADO = " +  x + " metros");
        
        //Sexto
        System.out.printf("RESULTALDO: = %2f metros%n", x);

        //Setimo

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha RS%.2f reais %n", nome, idade,renda);
    }
}