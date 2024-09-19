import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random =  new Random();
        int numb = random.nextInt(50);
        System.out.println(numb);
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número: ");
        int n_escolhido = sc.nextInt();
        while (true){
            if (n_escolhido<numb){
                System.out.println("Você errou! O numero é maior, tente novamente. ");
                System.out.println("Digite um número: ");
                n_escolhido= sc.nextInt();
            } else if (n_escolhido>numb) {
                System.out.println("Você errou! O numero é menor, tente novamente. ");
                System.out.println("Digite um número: ");
                n_escolhido= sc.nextInt();
            } else {
                System.out.println(" Você acertou! Parabéns!");
                break;
            }
        }

    }
}
