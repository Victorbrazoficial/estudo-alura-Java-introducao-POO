package bytebank_encapsulado;

public class Conta02 {
    
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente02 titular;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        
        if (this.getSaldo() >= valor) {

            this.saldo -= valor;
            return true; 

        } else {

            return false;
        }
    }

    public boolean transfere(double valor, Conta02 destino) {

        if (this.getSaldo() >= valor) {

            this.saca(valor);
            destino.deposita(valor);
            return true;

        } else {

            return false;
        }
    } 

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia <= 0) {
            System.out.println("Numero de agencia n pode ser igual nem menor que 0");
            return;
        } 
        this.agencia = agencia;
    }
    
    public int getNumero() {
        return this.numero;
    }
    
    public void setNumero(int numero) {
        if (numero <= 0) {
            System.out.println("Numero n pode ser igual nem menor que 0");
            return;    
        }
        this.numero = numero;
    }

    public Cliente02 getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente02 titular) {
        this.titular = titular;
    }
}