package ExerciciosLista1;//5. Escreva um programa que verifica se um número fornecido pelo usuário é primo.

import java.util.Scanner;

public class Exercicio5Lista1 {
    public static void main(String[] args) {
        //5. Escreva um programa que verifica se um número fornecido pelo usuário é primo.

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");

        int numero = entrada.nextInt();

        boolean primo = true;

        for(int i = 2; i <= numero/2; i++){
            if(numero % i == 0){
                primo = false;
                break;
            }
        }

        if(primo){
            System.out.println(numero + " é primo");
        }else{
            System.out.println(numero + " não é primo");
        }
        entrada.close();
    }
}
