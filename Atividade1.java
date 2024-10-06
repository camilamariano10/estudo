import java.util.Random;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        //LISTA DE EXERCICIOS 1:
        //EX. 1
//        String nome = "Camila";
//        String email = "camilamariano10@gmail.com";
//        System.out.println("Olá " + nome + "! Seu e-mail " + email + " foi cadastrado.");

        //EX. 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o seu nome: ");
//        String nome = sc.next();
//        System.out.println("Digite o seu e-amil: ");
//        String email = sc.next();
//        System.out.println("Olá " + nome + "! Seu e-mail " + email + " foi cadastrado.");

        //EX. 3
//        Scanner sc= new Scanner(System.in);
//        System.out.println("Digite o seu peso: ");
//        float peso = sc.nextFloat();
//        System.out.println("Digite a sua altura: ");
//        float altura = sc.nextFloat();
//        float imc = peso / (altura*altura);
//        System.out.println("O seu IMC é " + imc);
//
        //EX. 4
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite a 1º nota: ");
//        float nota1 = sc.nextFloat();
//        System.out.println("Digite a 2º nota: ");
//        float nota2 = sc.nextFloat();
//        System.out.println("Digite a 3º nota: ");
//        float nota3 = sc.nextFloat();
//        System.out.println("Digite a 4º nota: ");
//        float nota4 = sc.nextFloat();
//        float media = (nota1+nota2+nota3+nota4)/4;
//        boolean aprovado = (media >= 7);
//        System.out.println("A média é " + media + '\n' + "Média acima de 7 (Aprovado): " + aprovado + '\n'+"Média menor que 7 (Reprovado): " + !(aprovado));

        //EX. 1.1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite um número inteiro: ");
//        int number = sc.nextInt();
//        if (number%2==0){
//            System.out.println("O número " + number + " é par!");
//        } else {
//            System.out.println("O número " + number + " é impar!");
//        }
        //EX. 2.1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Qual operação matemática você deseja?"+'\n'+
//                "Soma: digite +"+'\n'+
//                "Subtração: digite -"+'\n'+
//                "Multiplicação: digite *"+'\n'+
//                "Divisão: digite /"+'\n');
//        String operacao = sc.next();
//        System.out.println("Digite o 1º número: ");
//        int number1 = sc.nextInt();
//        System.out.println("Digite o 2º número: ");
//        int number2 = sc.nextInt();
//
//        switch (operacao){
//            case "+" -> {
//                int soma= number1+number2;
//                System.out.println("A soma de " + number1 + " + " + number2 + " = " + soma);
//            }
//            case "-" -> {
//                int subtracao= number1-number2;
//                System.out.println("A subtração de " + number1 + " - " + number2 + " = " + subtracao);
//            }
//            case "*" -> {
//                int multiplicacao= number1*number2;
//                System.out.println("A multiplicação de " + number1 + " * " + number2 + " = " + multiplicacao);
//            }
//            case "/" -> {
//                int divisao= number1/number2;
//                System.out.println("A divisão de " + number1 + " / " + number2 + " = " + divisao);
//            }
//        }
        //EX 3.1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite a nota: ");
//        float nota = sc.nextFloat();
//        if (nota>=7){
//            System.out.println("Aprovado!");
//        } else if ((4<=nota)&(nota<7)) {
//            System.out.println("Em recuperação!");
//        } else {
//            System.out.println("Reprovado!");
//        }
        //EX 4.1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Escolha um numero de 1 a 10: ");
//        int number = sc.nextInt();
//        System.out.println("A tabuada de " + number + " é: " + '\n');
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(number + " x " + i + " = "+ (number*i));
//        }

        //EX 5.1
//gerar número aleatório
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100); // Alterado para ser de 0 a 100 por padrão
        //System.out.println(numeroAleatorio);

        // capturar valores pelo terminal
        Scanner scanner = new Scanner(System.in);

        int tentativas = 0;
        int limiteTentativas = 5;  // Definir limite de tentativas
        boolean venceu = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Escolha o nível de dificuldade: 1 - Fácil (0 a 50), 2 - Difícil (0 a 200)");
        int dificuldade = scanner.nextInt();

        if (dificuldade == 1) {
            numeroAleatorio = random.nextInt(50);  // Modo fácil
            System.out.println(numeroAleatorio);
        } else if (dificuldade == 2) {
            numeroAleatorio = random.nextInt(200);  // Modo difícil
            System.out.println(numeroAleatorio);
        }

        while (tentativas < limiteTentativas) {
            System.out.println("Tente adivinhar o número: ");
            int escolha = scanner.nextInt();
            tentativas++;

            //comparar condições
            if (escolha == numeroAleatorio) {
                System.out.println("Parabéns! O número era " + numeroAleatorio + "!");
                venceu = true;
                break;
            } else if (escolha > numeroAleatorio) {
                System.out.println("O número é menor.");
            } else {
                System.out.println("O número é maior.");
            }

            // Dicas adicionais
            if (Math.abs(escolha - numeroAleatorio) <= 5) {
                System.out.println("Você está muito perto!");
            }
            System.out.println("Tentativa " + tentativas + " de " + limiteTentativas);
        }

        if (!venceu) {
            System.out.println("Você perdeu! O número era " + numeroAleatorio);
        } else {
            System.out.println("Número de tentativas: " + tentativas);
        }


    }
}
