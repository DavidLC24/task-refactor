package org.example.task_refactor;

import java.util.Scanner;

public class refactor {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opt;
    do {
        opt = chooseOption(scanner);

        if (opt == 1) {
            int number = askNumber(scanner);

            sum(number);
        } else if (opt == 2) {
            int number = askNumber(scanner);

            average(number, scanner);
        } else if (opt == 3) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Opción inválida");
        }

    } while (opt != 3);}

    private static void average(int number, Scanner scanner) {
        int addition = 0;
        for (int i = 0; i < number; i++) {
            System.out.print("Introduce un número: ");
            addition += scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("La media es " + (addition / number));
    }

    private static void sum(int number) {
        int addition = 0;
        for (int i = 1; i <= number; i++) {
            addition += i;
        }

        System.out.println("El sumatorio es " + addition);
    }

    private static int askNumber(Scanner scanner) {
        int number;
        do {
            System.out.print("Introduce un entero positivo: ");
            number = scanner.nextInt();
            scanner.nextLine();
        } while (number <= 0);
        return number;
    }

    private static int chooseOption(Scanner scanner) {
        int opt;
        System.out.println("Elige una opción:");
        System.out.println("1. Sumatorio");
        System.out.println("2. Media");
        System.out.println("3. Salir");
        opt = scanner.nextInt();
        scanner.nextLine();
        return opt;
    }
}
