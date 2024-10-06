package SistemaBancario;
public abstract class ContaBancaria {
    private Cliente cliente;  // Encapsula o cliente
    private double saldo;     // Encapsula o saldo

    // Construtor
    public ContaBancaria(Cliente cliente) {
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    // Métodos abstratos a serem implementados nas subclasses (Abstração)
    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    // Método para transferir entre contas (Polimorfismo)
    public void transferir(double valor, ContaBancaria destino) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
            destino.saldo += valor;  // Acesso direto ao saldo da conta destino
            System.out.println("Transferência de R$" + valor + " realizada com sucesso para " + destino.cliente.getNome());
        } else {
            System.out.println("Transferência falhou. Saldo insuficiente ou valor inválido.");
        }
    }

    // Getters e Setters protegidos
    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
