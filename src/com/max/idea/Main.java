package com.max.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int n = 0;
        final int x = 10;
        final int y = 5;
        final int z = -1;

        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите элементы массива");
        for(int i = 0; i < n; i++)
        {
            int t = sc.nextInt();
            arr[i] = t;
        }

        for(int i = 0; i < n; i++)
        {
            int k = arr[i];
            if(k == x || k== y || k == z) System.out.println("Данное значение имеется в константах");
        }

        sc.close();
    }
}
