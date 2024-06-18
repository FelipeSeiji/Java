package Java.Secao9.A14Construtures_e_Sobrecarga.application;

import java.util.Locale;
import java.util.Scanner;

import Java.Secao9.A14Construtures_e_Sobrecarga.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name:");
        String name = sc.nextLine();

        System.out.println("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

            //add product
        System.out.println("Enter the nunber of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);
        System.out.println("Updated data: " + product);

            //remove product
        System.out.println("Enter the nunber of products to be revomed in stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);
        System.out.println("Updated data: " + product);
        sc.close();
    }
}