package bytebank;

public class TestaReferencia02 {

    public static void main(String[] args) {
        
        Conta primeiraConta = new Conta();
        Conta segundaConta = new Conta();

        primeiraConta.saldo = 500;
        System.out.println("saldo Primeira conta: " + primeiraConta.saldo);

        segundaConta.saldo = 500;
        System.out.println("saldo segunda conta: " + segundaConta.saldo);
        

        if (primeiraConta == segundaConta) {

            System.out.println(primeiraConta);
            System.out.println(segundaConta);
            System.out.println("Referencia da primeira conta é igual a segunda conta.");
        } else {

            System.out.println();
            System.out.println(primeiraConta);
            System.out.println(segundaConta);
            System.out.println("Referencia da primeira conta é diferente da segunda conta.");
        }
    }
}