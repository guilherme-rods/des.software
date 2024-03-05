import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        
        Scanner Idade = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade = Idade.nextInt();

        if (idade <= 13) {
            System.out.println("Você é uma criança!");
            
        }else if (idade <= 18) {
            System.out.println("Você é um adolescente!");
            
        }else if (idade <= 60) {
            System.out.println("Você é um adulto!");
        }else{
            System.out.println("Você é um idoso!");
        }

        Idade.close();
    }

}
