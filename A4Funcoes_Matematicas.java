package Java;

public class A4Funcoes_Matematicas {
    public static void main(String[] args) {
        double x = 3,y = 4,z = 5, a, b, c;

        //Primeiro
        a = Math.sqrt(x);
        b = Math.sqrt(y);
        c = Math.sqrt(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Segundo
        a = Math.pow(x,y);
        b = Math.pow(x,2);
        c = Math.pow(25,0);
        System.err.println(a);
        System.out.println(b);
        System.out.println(c);

        //Terceiro
        a = Math.abs(x);
        b = Math.abs(y);
        c = Math.abs(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
