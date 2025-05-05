package model;

import java.time.LocalDate;

public class Professor extends Funcionario {

    private String formacao;

    public Professor(String cpf, String nome, LocalDate nascimento, float salario, String formacao) {
        super(cpf, nome, nascimento, salario);
        this.formacao = formacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public float getSalario(){
        if(formacao.equals("Mestrado"))
            return super.getSalario()+1000;
        if(formacao.equals("Doutorado"))
            return super.getSalario()+2000;
        return super.getSalario();
    }

}
