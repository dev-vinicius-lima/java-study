package stud.devdojo.youtube.poo.teste;

import stud.devdojo.youtube.poo.domain.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.name = "Joaquim";
        funcionario.age = 25;
        funcionario.salary = new double[]{1200, 2000, 3000};
        funcionario.imprime();
        funcionario.imprimeMediaSalarial();
    }
}
