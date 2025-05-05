package view;

import model.Aluno;
import model.Pessoa;
import model.Professor;
import model.TecnicoAdministrativo;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Aluno("111.111.111-01", "João",
                LocalDate.now(), 123, "ADS");
        Pessoa pessoa2 = new Professor("222.222.222-02",
                "Maria", LocalDate.now(), 3000,
                "Mestrado");
    }
}