package bytebank_encapsulado;

public class Cliente02 {

    private String nome;
    private String cpf;
    private String profissao;
    private static int total; // variavel static, usada para contar quantas contas foram abertas

    public Cliente02() {  // exemplo para Testar a classe "TesteGeteSet"
        
    }

    public Cliente02(String nome, String cpf, String profissao) {  // exemplo para Testar a classe "TestaConstrutor"
        Cliente02.total++;
        this.nome = nome;
        this.cpf = cpf;
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return this.profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public static int getTotal() { // metodo static para retornar valor da variavel total
        return total;
    }
}