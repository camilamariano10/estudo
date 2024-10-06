public class Circulo {
    private double raio;  // Atributo para o raio

    // Método Construtor para inicializar o raio
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);  // A = π * r^2
    }

    // Método para calcular o perímetro do círculo
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;  // P = 2 * π * r
    }

    // Método para exibir informações do círculo
    public void exibirInformacoes() {
        System.out.println("Raio: " + raio);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
