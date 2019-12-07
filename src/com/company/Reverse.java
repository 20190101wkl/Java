package com.company;

public class Reverse {
    int reverse(int x){
        long result = 0;
        long VALUE=1L<<31;
        while(x!=0){
            result = result*10 + x%10;
            x = x/10;
        }
        if((result>VALUE-1) || (result<-VALUE)){
            return 0;
        }
        return (int)result;
    }

    public static void main(String[] args) {
        int x=2147483647;
        Reverse re=new Reverse();
        int result = re.reverse(x);
        System.out.println(result);
        System.out.println(1L<<31);
    }
}


