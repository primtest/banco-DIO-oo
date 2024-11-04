public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");
        banco.addCliente(venilton.getNome());

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        Cliente fulano = new Cliente();
        fulano.setNome("Fulano");
        banco.addCliente(fulano.getNome());


        Conta cc1 = new ContaCorrente(fulano);
        Conta poupanca1 = new ContaPoupanca(fulano);

        cc1.depositar(100);
        cc1.transferir(100, poupanca);

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        System.out.println("Lista de clientes do Banco: " + banco.verClientes());

    }
}