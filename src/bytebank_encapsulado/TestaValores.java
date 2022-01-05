package bytebank_encapsulado;

public class TestaValores {
    
    public static void main(String[] args) {
        
        Conta02 conta = new Conta02();

        conta.setAgencia(-5);
        System.out.println("numero agencia: " + conta.getAgencia());
        conta.setAgencia(0);
        System.out.println("numero agencia: " + conta.getAgencia());
        conta.setAgencia(11);
        System.out.println("numero agencia: " + conta.getAgencia());

        System.out.println();

        conta.setNumero(-44);
        System.out.println("numero conta: " + conta.getNumero());
        conta.setNumero(0);
        System.out.println("numero conta: " + conta.getNumero());
        conta.setNumero(13);
        System.out.println("numero conta: " + conta.getNumero());
    }
}