

package com.mycompany.mavenproject3;

import java.util.Scanner;

public class Mavenproject3 {

    public static void main(String[] args) {
        Scanner numero1Scanner = new Scanner (System.in);
        System.out.print("Digite o primeiro numero: ");
        int numero1 = numero1Scanner.nextInt();
        Scanner numero2Scanner = new Scanner (System.in);
        System.out.print("Digite o Segundo numero: ");
        int numero2 = numero1Scanner.nextInt();
        int resultado = numero1 + numero2;
        System.out.println("A soma dos numeros é: " + (resultado));
    }
}
