//1. Escreva um algoritmo que leia um número digitado pelo usuário e mostre 
//a mensagem “Número maior do que 10!”, caso este número seja maior, 
//ou “Número menor ou igual a 10!” caso este número seja menor ou igual.

import java.util.Scanner;

public class Ex01 {

    public static void executar(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int valor = leitor.nextInt();

        if(valor > 10){
            System.out.println("Número maior do que 10!");
        }else{
            System.out.println("Número menor ou igual a 10!");
        }
        
    }

    


}
