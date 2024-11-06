package stud.devdojo.youtube.poo.teste;

import stud.devdojo.youtube.poo.domain.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro car1 = new Carro();
        Carro car2 = new Carro();

        car1.nome = "Gol";
        car1.modelo = "Gol";
        car1.ano = 2018;

        car2.nome = "Fusca";
        car2.modelo = "Fusca";
        car2.ano = 2019;

        System.out.println("Carro 1 => " + car1.nome + " " + car1.modelo + " " + car1.ano);
        System.out.println("Carro 2 => " + car2.nome + " " + car2.modelo + " " + car2.ano);
    }
}
