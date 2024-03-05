import java.util.Scanner;

public class Vetores {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //Vetores
        int[] vetor1 = new int[] {1, 4, 7, 3, 5};

        int varx = vetor1[2]; // traz o valor "7" do vetor1 para a variável "varx"
        int[] vetor2 = new int[4];
        vetor2[3] = 25; //Atribuição de valor para a posição 4 do vetor

        // Repetidores
        System.out.println("Dados do Vetor 1:");
        for(int i = 0; i < 5; i++){
            int vlr = vetor1[i];
            System.out.println("Valor: " + vlr);
        }

        System.out.println("Dados do Vetor 2:");

        //Preencher o vetor 2 com dados
        int contador = 0;
        while(contador < vetor2.length){
            System.out.println("Digite o valor: " + (contador + 1));
            // int vlr = leitor.nextInt();
            // vetor2[contador] = vlr;
            // contador++;
            vetor2[contador++] = leitor.nextInt();
        }

        // Dobrar os valores do vetor 2:
        contador = 0;

        do{
            if(vetor2[0] == 0){
                System.out.println("O valor da posição 1 não pode ser zero!");
                break;
            }
            vetor2[contador] = vetor2[contador] * 2;
            contador++;
        }while(contador < vetor2.length);

        for(int i = 0; i < vetor2.length; i++){
            int vlr = vetor2[i];
            System.out.println("Valor: " + vlr);
        }

        leitor.close();

    }

}
