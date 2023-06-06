package com.agussaf;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("-- Kalkulator Penghitung --");
            System.out.println("1. Hitung Luas Bidang");
            System.out.println("2. Hitung Volume");
            System.out.println("0. Exit");
            System.out.print("Pilih operasi yang ingin Anda lakukan: ");

            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Thankyou!");
                break;
            }

            switch (choice) {
                case 1:
                    calculateArea(scanner);
                    break;
                case 2:
                    calculateVolume(scanner);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    private static void calculateArea(Scanner scanner) {
        System.out.println("=== Menghitung Luas Bidang ===");
        System.out.println("1. Persegi");
        System.out.println("2. Lingkaran");
        System.out.println("3. Segitiga");
        System.out.println("4. Persegi Panjang");
        System.out.print("Pilih bentuk: ");

        int shapeChoice = scanner.nextInt();

        switch (shapeChoice) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double side = scanner.nextDouble();
                double squareArea = side * side;
                System.out.println("Luas persegi: " + squareArea);
                break;
            case 2:
                System.out.print("Masukkan jari-jari: ");
                double radius = scanner.nextDouble();
                double circleArea = Math.PI * radius * radius;
                System.out.println("Luas lingkaran: " + circleArea);
                break;
            case 3:
                System.out.println("Masukkan panjang alas segitiga:");
                double alas = scanner.nextDouble();
                System.out.println("Masukkan tinggi segitiga:");
                double tinggi = scanner.nextDouble();
                double luas = (alas * tinggi) / 2;
                System.out.println("Luas segitiga adalah: " + luas);
                break;
            case 4:
                System.out.print("Masukkan panjang: ");
                double length = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double width = scanner.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Luas persegi panjang: " + rectangleArea);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }

    private static void calculateVolume(Scanner scanner) {
        System.out.println("=== Menghitung Volume ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.print("Pilih bentuk: ");

        int shapeChoice = scanner.nextInt();

        switch (shapeChoice) {
            case 1:
                System.out.print("Masukkan panjang sisi: ");
                double side = scanner.nextDouble();
                double cubeVolume = side * side * side;
                System.out.println("Volume kubus: " + cubeVolume);
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double length = scanner.nextDouble();
                System.out.print("Masukkan lebar: ");
                double width = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double height = scanner.nextDouble();
                double rectangularVolume = length * width * height;
                System.out.println("Volume balok: " + rectangularVolume);
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double radius = scanner.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double cylinderHeight = scanner.nextDouble();
                double cylinderVolume = Math.PI * radius * radius * cylinderHeight;
                System.out.println("Volume tabung: " + cylinderVolume);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }
}
