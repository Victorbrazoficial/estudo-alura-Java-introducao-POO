package bytebank;

// Instanciando Obejtos
public class CriaConta {

    public static void main(String[] args) {
        
       Conta primeiraConta = new Conta();
       Conta segundaConta = new Conta();
       
       primeiraConta.saldo = 200;
       segundaConta.saldo = 160;

       System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
       System.out.println("Saldo segunda conta: " + segundaConta.saldo);
       System.out.println(primeiraConta.agencia);
       System.out.println(primeiraConta.numero);
       System.out.println(primeiraConta.titular);
    }
}