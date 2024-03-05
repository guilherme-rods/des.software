
import java.util.Scanner;

public class Console { /* A palavra "public" pode ser retirada do código se quiser. 
Sempre aplicar "Camelcase" no nome da classe.*/

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in); //Atribui ao objeto leitor o texto a ser digitado.


        //Exemplo 4:
        String[] letras = new String[]{"A","B","C","D"};
        String letraB = letras[1];

        //ou:

        // for(int i = 0; i < 3; i++){
        //     String letraB = letras[i];
        //     System.out.println("Letra: " + letra);
        // }

        //ou:

        // int contador = 0;
        // while(contador < letras.length){
        //     String letraB = letras[i];
        //     System.out.println("Letra: " + letra);
        //     contador ++;
        // }

        //ou:

        // for(int i = 0; i < letras.length; i++){
        //     String letraB = letras[i];
        //     System.out.println("Letra: " + letra);
        // }

        //ou FOR avançado:

        for(String letra : letras){
            System.out.println("Letra: " + letra);
        }

        // Exemplo 3:

        // for(int i = 0; i < 100; i++){
        //     //System.out.println("Número " + i); ou
        //     System.out.printf("Número %d%n", i);
        // }

        //Exemplo 2:

        // System.out.println("Digite a nota A: ");
        // double a = leitor.nextDouble();

        // System.out.println("Digite a nota B: ");
        // double b = leitor.nextDouble();

        // double resultado = (a + b)/2;

        // if (resultado >= 6){
        //     System.out.println("Aprovado!");
        // } else if(resultado > 1){
        //     System.out.println("Recuperação!");
        // } else{
        //     System.out.println("Reprovado");
        // }

        // System.out.println("Resultado: " + resultado);

        //Exemplo 1:

        // System.out.println("Digite um texto: "); //Conversa com o usuário solicitando um texto qualquer.
        // String mensagem = leitor.nextLine(); //Recebe o texto digitado anteriormente.
        // //Para imprimir o texto definido na variável usamos:
        // //printf ou println
        // System.out.println(mensagem);

        leitor.close();

    }
}
