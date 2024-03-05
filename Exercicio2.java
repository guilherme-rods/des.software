import java.util.Scanner;

public class Exercicio2 {

    public static String getDecimal(double vlr){
        return String.format("%.2f", vlr);
    } 

    public static void main(String[] args) {
        
        Scanner conversao = new Scanner(System.in);

        System.out.println("Digite o valor a ser convertido: ");
        double valor = conversao.nextDouble();

        double dolar = valor / 5.17;
        double euro = valor / 6.14;
        double peso = valor / 0.05;

        System.out.println("Você possui " +  getDecimal(dolar) + " $");
        System.out.println("Você possui " + getDecimal(euro) + " E$");
        System.out.println("Você possui " + getDecimal(peso) + " P$");

        conversao.close();

    }

}
