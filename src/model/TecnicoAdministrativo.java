package model;

import java.time.LocalDate;

public class TecnicoAdministrativo extends Pessoa {

    private float salario;
    private String setor;

    public TecnicoAdministrativo(String cpf, String nome, LocalDate nascimento, float salario, String setor) {
        super(cpf, nome, nascimento);
        this.salario = salario;
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
