package SistemaBancario;
public class ContaCorrente extends ContaBancaria {

    private double taxaManutencao = 10.0;  // Taxa de manutenção mensal

    // Construtor
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    // Implementação dos métodos abstratos (Polimorfismo)
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na Conta Corrente de " + getCliente().getNome());
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso da Conta Corrente de " + getCliente().getNome());
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para cobrar a taxa de manutenção
    public void cobrarTaxaManutencao() {
        if (getSaldo() >= taxaManutencao) {
            setSaldo(getSaldo() - taxaManutencao);
            System.out.println("Taxa de manutenção de R$" + taxaManutencao + " cobrada da Conta Corrente de " + getCliente().getNome());
        } else {
            System.out.println("Saldo insuficiente para cobrança da taxa de manutenção.");
        }
    }
}
