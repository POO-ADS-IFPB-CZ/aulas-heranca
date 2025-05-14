package model;

import java.time.LocalDate;

public abstract class Cliente {

    private LocalDate dataCadastro;

    public Cliente(){
        dataCadastro = LocalDate.now();
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
}
