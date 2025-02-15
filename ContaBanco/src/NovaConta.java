public class NovaConta {
    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public NovaConta(String nomeCliente, String agencia, int numeroConta, double saldo) {
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}
