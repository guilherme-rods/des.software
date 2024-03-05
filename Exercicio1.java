//Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área.

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        
        Scanner retangulo = new Scanner(System.in);

        System.out.println("Digite a altura do retângulo: ");
        double altura = retangulo.nextDouble();

        System.out.println("Digite a largura do retângulo: ");
        double largura = retangulo.nextDouble();

        double area = altura * largura;

        System.out.println("A área do retângulo é: " + area + " m²");

        retangulo.close();


    }

}
