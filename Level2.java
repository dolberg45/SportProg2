package com.company;

public class Level1 {

    public static int odometer(int [] oksana) {
        int distance = 0;
        int granicaForSpeed = oksana.length; // счетчик для км/ч последний элемент массива
        int granicaForHour = oksana.length; // счетчик для часов

        if(oksana.length >= 2 && oksana.length % 2 == 0){ //проверка на N >= 2 и четное колл элементов

            while(granicaForHour != 0 && granicaForSpeed != 0){
                if(granicaForHour-3 == -1){
                    int hour = oksana[granicaForHour-1] - 0;
                    distance = distance + oksana[granicaForSpeed-2] * hour;
                }
                else {
                    int hour = oksana[granicaForHour-1] - oksana[granicaForHour-3];
                    distance = distance + oksana[granicaForSpeed-2] * hour;
                }
                granicaForHour -= 2;
                granicaForSpeed -= 2;
                }
            return distance;
        }
        else {
            return 0;
        }
    }
}
