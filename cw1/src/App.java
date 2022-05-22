package PGO_ggc_s22563.cw1.src;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // exercise6();
        exercise7();
    }

    static public void exercise6() {
        System.out.println("zadanie6");
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 900) + 100;
        }
        System.out.print("Generated array:[ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("] ");

        System.out.print("Sorted array:[ ");
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.print(arr[i] + ",");
        }
        System.out.print("] ");
    }

    static public void exercise7() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input odd number larger than 5: ");
        int n = scan.nextInt();
        if (n < 5) {
            while (n < 5 || n % 2 != 0) {
                System.out.print("Input odd number larger than 5: ");
                n = scan.nextInt();
            }
        } else if (n % 2 == 0) {
            while (n % 2 == 0) {
                System.out.print("Input odd number larger than 5: ");
                n = scan.nextInt();
            }
        }

        scan.close();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n
                        || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
