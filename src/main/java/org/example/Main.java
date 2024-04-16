package org.example;

public class Main {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        System.out.println(x+y);
        System.out.println("" +x +"" +y);

        // (101)2 = 1*2^2+0*2^1+1*2^0 = 5;
        // (11)2 = 1*2^1+1*2^0 = 3;
        // (111)2 = 1*2^2+1*2^1+1*2^0 = 7;
        // (2)10 = (10)2
        // (23)10 = (10111)2
        // (15) = (1111)2
        int i = 5;
        // i = i++; out = 5;
        // i= i++ + i++; out = 11
        // i = i++ + ++i; out = 12
        i = ++i + ++i;
        System.out.println(i);
        // through all of this operation is being viewed clearly logic
    }
}
