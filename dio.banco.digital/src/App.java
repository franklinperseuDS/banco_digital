public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente("Thom");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        IConta cp = new ContaPoupanca(cliente);
        cc.transferir(50, cp);
       cc.imprimirExtrato();
       cp.imprimirExtrato();
    }
}
