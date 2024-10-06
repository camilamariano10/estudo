public class Main3 {
    public static void main(String[] args) {
        // Criando objetos da classe Círculo com diferentes valores de raio
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(7.2);

        // Exibindo informações do primeiro círculo
        System.out.println("Informações do Círculo 1:");
        circulo1.exibirInformacoes();

        // Exibindo informações do segundo círculo
        System.out.println("\nInformações do Círculo 2:");
        circulo2.exibirInformacoes();
    }
}
