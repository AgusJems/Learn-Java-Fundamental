package com.agussaf;

public class JavaLoopCondition {
    public static void main(String[] args) {
        
        System.out.println("for dengan kondisi:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Nilai i: " + i);
            }
        }

        System.out.println("while dengan kondisi:");
        int j = 1;
        while (j <= 10) {
            if (j % 2 != 0) {
                System.out.println("Nilai j: " + j);
            }
            j++;
        }

        System.out.println("do-while dengan kondisi:");
        int k = 1;
        do {
            if (k % 3 == 0) {
                System.out.println("Nilai k: " + k);
            }
            k++;
        } while (k <= 10);
    }
}
