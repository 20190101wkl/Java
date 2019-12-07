package com.company;

import java.util.Scanner;

public class Main {

    public static boolean isPrime(int x){
        boolean flag = true;
        for (int i = 2;i < x; i++){
            if(x%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int min = (int)Math.pow(10,n-1);
        int max = (int)Math.pow(10,n);
        int temp = 0;
        boolean flag = false;
        for(int i=min;i<max;i++){
            if(isPrime(i)){
                temp = i;
                while(temp!=0){
                    temp=temp/10;
                    if(!isPrime(temp)) {
                        flag=false;
                        break;
                    }
                    flag=true;
                }
            }
            if(flag){
                System.out.println(i);
            }
            flag=false;
        }
    }
}
