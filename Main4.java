public class Main4 {
    public static void main(String[] args) {
        // Criando um objeto de ContaBancaria
        ContaBancaria conta1 = new ContaBancaria("12345-6", "Maria Silva", 1000.0);

        // Exibindo informações da conta
        conta1.exibirInformacoes();

        // Realizando depósito
        conta1.depositar(500.0);

        // Verificando saldo após depósito
        conta1.verificarSaldo();

        // Realizando saque
        conta1.sacar(300.0);

        // Verificando saldo após saque
        conta1.verificarSaldo();

        // Tentando sacar um valor maior que o saldo
        conta1.sacar(1500.0);

        // Verificando saldo após tentativa de saque
        conta1.verificarSaldo();
    }
}
