package ExerciciosLista1;//4. Escreva um programa que imprime os fatores de um número fornecido pelo usuário.

import java.util.Scanner;

public class Exercicio4Lista1 {
    public static void main(String[] args) {
        /*4. Escreva um programa que imprime os fatores de um número fornecido pelo usuário. */

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroEntrada = entrada.nextInt();

        for (int i = 1; i <= numeroEntrada; i++) {
            if (numeroEntrada % i == 0) {
                System.out.println(i);
            }
        }
        entrada.close();
    }
}
