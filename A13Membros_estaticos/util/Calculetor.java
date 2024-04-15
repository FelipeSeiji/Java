package Java.A13Membros_estaticos.util;

public class Calculetor {
    public static final double PI = 3.14159;

    public static double circumference(double radius){
        return 2*PI*radius;
    }
    public static double volume(double radius){
        return 4*PI*radius*radius*radius/3;
    }
}
