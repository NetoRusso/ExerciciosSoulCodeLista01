package ExerciciosLista1;//1. Escreva um programa que verifica se um número é positivo, negativo ou zero.


import java.util.Scanner;

public class Exercicio1Lista1 {

    public static void main(String[] args) {

        //1. Escreva um programa que verifica se um número é positivo, negativo ou zero.

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroEntrada = entrada.nextInt();

        if (numeroEntrada > 0) {
            System.out.println("O número " + numeroEntrada + " é positivo.");
        } else if (numeroEntrada < 0) {
            System.out.println("O número " + numeroEntrada + " é negativo.");
        } else {
            System.out.println("O número " + numeroEntrada + " é zero.");
        }
        entrada.close();
    }
}
