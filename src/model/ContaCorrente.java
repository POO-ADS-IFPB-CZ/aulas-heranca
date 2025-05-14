package model;

public class ContaCorrente extends Conta{

    private double chequeEspecial;

    public ContaCorrente(int numero, double saldo, Cliente cliente, double chequeEspecial) {
        super(numero, saldo, cliente);
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public void cobrarTaxa(){
        if(getCliente() instanceof PessoaFisica){
            setSaldo(getSaldo()-10);
        }
        if(getCliente().getClass()==PessoaJuridica.class){
            setSaldo(getSaldo()-100);
        }
    }

}
