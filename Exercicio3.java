import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner Condicao = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = Condicao.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = Condicao.nextInt();

        if (num1 > num2) {
            System.out.println("O maior número inteiro digitado é: " + num1);;
            
        }else{
            System.out.println("O maior número inteiro digitado é: " + num2);
        }

        Condicao.close();

    }

}
