package SistemaBancario;
public class ContaPoupanca extends ContaBancaria {

    private double rendimentoMensal = 0.02;  // 2% de rendimento mensal

    // Construtor
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    // Implementação dos métodos abstratos (Polimorfismo)
    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depósito de R$" + valor + " realizado com sucesso na Conta Poupança de " + getCliente().getNome());
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso da Conta Poupança de " + getCliente().getNome());
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para aplicar rendimento
    public void aplicarRendimento() {
        double rendimento = getSaldo() * rendimentoMensal;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado à Conta Poupança de " + getCliente().getNome());
    }
}
