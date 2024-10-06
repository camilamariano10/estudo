import java.util.ArrayList;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        // LISTA DE EXERCICIOS 2
        //EX. 1:
//        int arrayint[] = {1, 1, 1, 3};
//        int soma = 0;
//
//        for (int i : arrayint) {
//            soma += i;
//        }
//        System.out.println(soma);


        //EX. 2:
//        int[] arrayinteiros = {10,2,55,4,5};
//        System.out.println("Lista: " + Arrays.toString(arrayinteiros));
//        OptionalInt menor = Arrays.stream(arrayinteiros).min();
//        System.out.println("O menor numero da lista é " + menor.getAsInt());
//        OptionalInt maior = Arrays.stream(arrayinteiros).max();
//        System.out.println("O maior número da lista é " + maior.getAsInt());

        //EX. 3:
//        Scanner sc = new Scanner(System.in);
//        ArrayList notas = new ArrayList();
//        float soma=0;
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Insira a nota:");
//            float nota1 = sc.nextFloat();
//            notas.add(nota1);
//            soma+=nota1;
//
//        }
//        float media = soma/4;
//        System.out.println("A média é: "+ media);

        //EX. 4:
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> tarefas = new ArrayList<>();
        String menu = '\n' + "Adicionar tarefa - " + "1" + '\n' + "Remover tarefa - " + "2" + '\n' + "Listar tarefas - " + "3" + '\n' + "Sair - " + "0";
        System.out.println("Este é seu aplicativo de tarefas" + menu + '\n' + "O que você gostaria de fazer? ");
        String intencao = sc.next();
        while (!intencao.equals("0")) {
            switch (intencao) {
                case "1" -> {
                    System.out.println("Digite a tarefa que você gostaria de adicionar: ");
                    tarefas.add(sc.next());
                }

                case "2" -> {
                    System.out.println("Digite a tarefa que você gostaria de remover: ");
                    tarefas.remove(sc.next());
                }

                case "3" -> {
                    System.out.println(tarefas);
                }

                case "0"-> {
                    System.out.println("Saindo..");
                }
                default -> System.out.println("Opção inválida, tente novamente.");
            }
            System.out.println("Este é seu aplicativo de tarefas" + menu + '\n' + "O que você gostaria de fazer? ");
            intencao = sc.next();
        }
        System.out.println("Aplicativo encerrado.");
        sc.close();

    }
}
