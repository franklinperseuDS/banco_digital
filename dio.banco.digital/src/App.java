public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco("Brasil");
        Cliente cliente = new Cliente("Thom");

        Conta cc = new ContaCorrente(cliente);
        banco.addConta(cc);
        cc.depositar(100);

        IConta cp = new ContaPoupanca(cliente);
        banco.addConta(cp);
        cc.transferir(50, cp);
       cc.imprimirExtrato();
       cp.imprimirExtrato();
       banco.getContas();
    }
}
