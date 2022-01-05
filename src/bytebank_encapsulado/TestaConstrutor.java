package bytebank_encapsulado;

public class TestaConstrutor {

    public static void main(String[] args) {
        
        Cliente02 cliente = new Cliente02("Braz", "111.111.111-11", "Developer");

        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
        System.out.println(cliente.getProfissao());
    } 
}