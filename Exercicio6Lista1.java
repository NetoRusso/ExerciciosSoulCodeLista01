package ExerciciosLista1;//6. Escreva um programa que encontra o maior número em uma lista de números fornecida pelo usuário.

import java.util.Scanner;

public class Exercicio6Lista1 {
    public static void main(String[] args) {
        //6. Escreva um programa que encontra o maior número em uma lista de números fornecida pelo usuário.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o numero de itens da lista: ");

        int numeroItens = entrada.nextInt();
        int maiorNumero = 0;
        for (int i = 0; i < numeroItens; i++){
            System.out.println("Digite um número inteiro: ");
            int numero = entrada.nextInt();
            if (numero > maiorNumero) {
                maiorNumero = numero;
                System.out.println("O maior numero é " + maiorNumero);
            }
        }
        entrada.close();
    }
}
