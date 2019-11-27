package com.company;

public class Level1 {

    public static int squirrel(int N) {
        if (N >= 0) {
            int result = 1;
            while (N > 0) {
                result *= N;
                N -= 1;
            }
            while (result >= 10) {
                result /= 10;
            }
            return result;
        }
        else {
            return 0;
        }
    }
}