package bytebank;

public class TestaMetodo {
    public static void main(String[] args) {
        
        Conta conta = new Conta();

        System.out.println("Saldo conta: " + conta.saldo);
        conta.deposita(50);
        System.out.println("Saldo conta: " + conta.saldo);

        boolean conseguiuSacar = conta.saca(20);
        System.out.println("Saldo conta: " + conta.saldo);
        System.out.println(conseguiuSacar);
        System.out.println();

        Conta contaBraz = new Conta();
        
        System.out.println("Saldo conta Braz: " + contaBraz.saldo);
        
        boolean conseguiuTransferir = conta.transfere(10, contaBraz);
        System.out.println("Saldo Conta braz: " + contaBraz.saldo);
        System.out.println(conseguiuTransferir);

        System.out.println("saldo Conta: " + conta.saldo);
    }
}