package Java.Secao8.A12Problema2.application;

import java.util.Locale;
import java.util.Scanner;

import Java.Secao8.A12Problema2.entities.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name:");
        product.name = sc.nextLine();

        System.out.println("Proce: ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product);

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
