package stud.devdojo.youtube.poo.teste;

import stud.devdojo.youtube.poo.domain.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setName("Joaquim");
        pessoa.setAge(70);
        pessoa.imprime();
    }
}
