package SistemaBancario;
public class Main {
    public static void main(String[] args) {
        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        // Criando contas para os clientes
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaPoupanca cp1 = new ContaPoupanca(cliente2);

        // Realizando operações com Conta Corrente
        cc1.depositar(1000.0);
        cc1.sacar(300.0);
        cc1.cobrarTaxaManutencao();
        System.out.println("Saldo da Conta Corrente: R$" + cc1.getSaldo());

        // Realizando operações com Conta Poupança
        cp1.depositar(2000.0);
        cp1.aplicarRendimento();
        cp1.sacar(500.0);
        System.out.println("Saldo da Conta Poupança: R$" + cp1.getSaldo());

        // Transferência entre contas
        cc1.transferir(100.0, cp1);
        System.out.println("Saldo da Conta Corrente após transferência: R$" + cc1.getSaldo());
        System.out.println("Saldo da Conta Poupança após transferência: R$" + cp1.getSaldo());
    }
}
