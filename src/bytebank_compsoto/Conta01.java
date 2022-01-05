package bytebank_compsoto;

public class Conta01 {
    
    double saldo;
    int agencia;
    int numero;
    Cliente01 titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        
        if (this.saldo >= valor) {

            this.saldo -= valor;
            return true; 

        } else {

            return false;
        }
    }

    public boolean transfere(double valor, Conta01 destino) {

        if (this.saldo >= valor) {

            this.saca(valor);
            destino.deposita(valor);
            return true;

        } else {

            return false;
        }
    } 
}