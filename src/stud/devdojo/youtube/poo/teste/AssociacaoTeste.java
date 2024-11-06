package stud.devdojo.youtube.poo.teste;

import stud.devdojo.youtube.poo.domain.Aluno;
import stud.devdojo.youtube.poo.domain.Local;
import stud.devdojo.youtube.poo.domain.Professor;
import stud.devdojo.youtube.poo.domain.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua dos devs");

        Aluno aluno = new Aluno(17, "vinicius");
        Professor professor = new Professor("barba branca", "pirata");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario(alunosParaSeminario, local, "Onde achar os devs");
        Seminario[] seminariesOfProfessor = {seminario};
        professor.setSeminaries(seminariesOfProfessor);

        professor.print();
    }
}
