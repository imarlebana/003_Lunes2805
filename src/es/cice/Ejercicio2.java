package es.cice;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String[] args) {

        System.out.println("Introduce un numero:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num%2==0){
            System.out.println("El numero introducido es par");
        }else{
            System.out.println("El numero introducido es impar");
        }

    }
}
