package ExerciciosLista1;//10. Escreva um programa que calcula o fatorial de um número fornecido pelo usuário.

import java.util.Scanner;

public class Exercicio10Lista1 {
    public static void main(String[] args) {
        //10. Escreva um programa que calcula o fatorial de um número fornecido pelo usuário.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
            fatorial = fatorial * i;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);
        entrada.close();
    }
}
