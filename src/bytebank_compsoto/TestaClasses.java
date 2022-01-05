package bytebank_compsoto;

public class TestaClasses {
    
    public static void main(String[] args) {
        
        Cliente01 braz = new Cliente01();

        braz.nome = "Braz";
        braz.cpf = "122.122.122-22";
        braz.profissao = "Developer";

        System.out.println(braz.nome);
        System.out.println(braz.cpf);
        System.out.println(braz.profissao);
        System.out.println();

        Conta01 contaDoBraz = new Conta01();
        
        contaDoBraz.titular = braz;
        contaDoBraz.titular.profissao = "Developer Junior";

        System.out.println(contaDoBraz.titular.nome);
        System.out.println(contaDoBraz.titular.cpf);
        System.out.println(contaDoBraz.titular.profissao);   
    }
}