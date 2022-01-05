package bytebank_encapsulado;

public class TestaStatic {
    
    public static void main(String[] args) {
        
        Cliente02 cliente = new Cliente02("Braz", "111.111.111-11", "Developer");
        Cliente02 cliente01 = new Cliente02("Braz", "111.111.111-11", "Developer");
        Cliente02 cliente02 = new Cliente02("Braz", "111.111.111-11", "Developer");
        Cliente02 cliente03 = new Cliente02("Braz", "111.111.111-11", "Developer");

        System.out.println("Foram criadas " + Cliente02.getTotal() + " contas no total"); // print do get da variavel static que acumula valor de quantas contas foram criadas.
    }
}