package bytebank;

public class TestaReferencia {
    
    public static void main(String[] args) {
        
        Conta primeirConta = new Conta();
        Conta segundaConta = new Conta();

        primeirConta.saldo = 500;
        System.out.println("Saldo primeira Conta: " + primeirConta.saldo);
        
        segundaConta = primeirConta;
        System.out.println("Saldo segunda Conta: " + segundaConta.saldo);

        // Imprime 1500, pois as duas referências (primeiraConta e segundaConta) apontam para o mesmo objeto, fazendo com que a quantidade 1000 seja somada à anterior 500.
        segundaConta.saldo += 1000;
        System.out.println();
        System.out.println("---------");
        System.out.println("saldo segunda conta: " + segundaConta.saldo);
        System.out.println("saldo primeira conta: " + primeirConta.saldo);
        System.out.println("---------");

        if (primeirConta == segundaConta) {

            System.out.println();
            System.out.println(primeirConta);
            System.out.println(segundaConta);
            System.out.println("Referencia da Primeira Conta é igual a Segunda Conta.");
        }
    } 
}