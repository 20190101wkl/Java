package com.company;

public class RetrunTest {
    public static int test(){
        int b = 20;
        try{
            b = b/0;
            return b+=80;
        }catch (Exception e){
            return b+=15;
        }finally {
            b+=50;
        }
    }
}
