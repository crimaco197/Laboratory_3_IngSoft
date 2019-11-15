package com.company;

import java.util.Scanner;

public class Main {

    public static void printOrderDetails(CoffeProduct coffeProduct, String name){
        System.out.println("-------------------------------------------------------------------");
        System.out.println("\nDetalles de la orden\n" +
                name + ": " + coffeProduct.getName() +
                "\nValor: $" + coffeProduct.getPrice());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu:\n\n" +
                            "1 - Simple: just coffee.\n" +
                            "2 - Elementary: with milk.\n" +
                            "3 - Sophisticated: with milk and cook time > 2 minutes.\n" +
                            "4 - Basic: without milk and cook time > 2 minutes.\n" +
                            "5 - Advanced: with milk, mocha and a figure in the cover.\n");
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Precios:\n\n" +
                "Cafe: $1500\n" +
                "Adicional de Leche: $1000\n" +
                "Timepo de cocinado > 2 minutos: $1200\n" +
                "Adicional de mocha: $2000\n" +
                "Figura en la cubierta: $500\n");
        System.out.print("Ingrese el numero del cafe que desea recibir: ");
        int choice = scanner.nextInt();

        CoffeProduct orderedCoffe = new Coffe();

        switch (choice){
            case 1:

                printOrderDetails(orderedCoffe, "Simple");
                break;
            case 2:
                orderedCoffe = new Milk(orderedCoffe);
                printOrderDetails(orderedCoffe, "Elementary");
                break;
            case 3:
                orderedCoffe = new Milk(orderedCoffe);
                orderedCoffe = new CookTime(orderedCoffe);
                printOrderDetails(orderedCoffe, "Sophisticated");
                break;
            case 4:
                orderedCoffe = new CookTime(orderedCoffe);
                printOrderDetails(orderedCoffe, "Basic");
                break;
            case 5:
                orderedCoffe = new Milk(orderedCoffe);
                orderedCoffe = new Mocha(orderedCoffe);
                orderedCoffe = new CoverFigure(orderedCoffe);
                printOrderDetails(orderedCoffe, "Advanced");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
