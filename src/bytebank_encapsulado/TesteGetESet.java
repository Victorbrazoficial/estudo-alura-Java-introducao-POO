package bytebank_encapsulado;

public class TesteGetESet {
    
    public static void main(String[] args) {
        
        Conta02 conta = new Conta02();
        conta.setTitular(new Cliente02()); 

        conta.getTitular().setNome("Gui");
        conta.getTitular().setCpf("111.111.111-11");
        conta.getTitular().setProfissao("Develoepr");
        System.out.println(conta.getTitular().getNome());
        System.out.println(conta.getTitular().getCpf());
        System.out.println(conta.getTitular().getProfissao());
    }
}