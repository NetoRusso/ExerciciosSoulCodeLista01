package ExerciciosLista1;// 2. Escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.

import java.util.Scanner;

public class Exercicio2Lista2 {
    public static void main(String[] args) {

        // 2. Escreva um programa que calcula a média de uma lista de números fornecida pelo usuário.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de elementos da lista: ");
        int qtdElementos = entrada.nextInt();
        int acumulador = 0;
        for (int i = 0; i < qtdElementos; i++) {
            System.out.println("Digite um número inteiro: ");
            int numero = entrada.nextInt();
            acumulador += numero;
        }
        double media = (double) acumulador / qtdElementos;
        System.out.println("A média é " + media);
        entrada.close();
    }
}
