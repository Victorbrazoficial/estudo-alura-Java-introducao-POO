package bytebank_compsoto;

/*
 Não é possivel inserir valor na (contadoDojoao.titular.nome) se não tiver instanciado e apontado o atributo titular
 para a referencia de objeto de nome cliente.
 */
public class TestaContaSemCliente {

    public static void main(String[] args) {
        
        Conta01 contaDaJoana = new Conta01();
        contaDaJoana.titular = new Cliente01();

        contaDaJoana.titular.nome = "Joana";
        contaDaJoana.titular.cpf = "111.111.111-11";
        contaDaJoana.titular.profissao = "Arquiteta";

        System.out.println(contaDaJoana.titular.nome);
        System.out.println(contaDaJoana.titular.cpf);
        System.out.println(contaDaJoana.titular.profissao);

        Conta01 contaDoJoao = new Conta01();
        contaDoJoao.titular = new Cliente01();

        contaDoJoao.titular.nome = "Jão";
        System.out.println(contaDoJoao.titular.nome);
    }
}