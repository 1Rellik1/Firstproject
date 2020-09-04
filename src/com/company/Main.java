package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ////////////Task3/////////////
        int sum_for=0,sum_while=0,sum_do_while=0;
        boolean b = true;
        Scanner scan= new Scanner(System.in);
        int[] mas= new int[5];
        for (int i=0;i<5;i++){
            mas[i]= (int)(Math.random()*100);
        }
        for (int i=0;i < 5;i++){
            sum_for=sum_for+mas[i];
        }
        int count_while=0, count_do_while=0;
        while (count_while<5){
            sum_while=mas[count_while]+sum_while;
            count_while++;
        }
        do{
            sum_do_while=mas[count_do_while]+sum_do_while;
            count_do_while++;
        }while(count_do_while!=5);
        System.out.println("Сумма найденная циклом do while:"+sum_do_while+"  Сумма найденная циклом for:"+sum_for+"    Сумма найденная циклом while: "+ sum_while);
        ///////////////task4////////////////

        for(String out : args){
            System.out.println(out);
        }

        ///////////////Task5////////////////
        System.out.println("Первые 10 элементов гармонического ряда");
        for(int i=1;i<=10;i++){
            double res= 1/(double) i;
            String formattedDouble = String.format("%.2f", res);
            System.out.print(formattedDouble + " ");
        }


        ////////////Task6////////////

        for (int i=0;i<5;i++){
            mas[i]= (int)(Math.random()*100);
        }
        System.out.println();
        System.out.print("Рандомный массив:  ");
        for (int i=0;i<5;i++){
            System.out.print(mas[i] +"  ");
        }
        for(int i = 4 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++) {
                if (mas[j] > mas[j + 1]) {
                    int tmp = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = tmp;
                }
            }
        }
        System.out.println();
        System.out.print("Отсартированный массив:  ");
        for (int i=0;i<5;i++){
            System.out.print(mas[i] +"  ");
        }
    }
}
