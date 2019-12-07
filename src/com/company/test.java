package com.company;


import java.util.Scanner;

public class test {

    static int maxProd(int n) {

        if (n == 0 || n == 1)
            return 0;


        int max_val = 0;
        for (int i = 1; i < n; i++)
            max_val = Math.max(max_val, Math.max(i * (n - i), maxProd(n - i) * i));


        return max_val;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(maxProd(n));
    }
}
