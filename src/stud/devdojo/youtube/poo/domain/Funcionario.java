package stud.devdojo.youtube.poo.domain;

import java.util.Arrays;

public class Funcionario {
    public String name;
    public int age;
    public double[] salary;

    public void imprime() {
        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        if (salary != null) {
            for (double salary : salary) {
                System.out.print(salary + " ");
            }
        }
    }

    public void imprimeMediaSalarial() {
        if (salary == null) {
            return;
        }
        double media = 0;

        for (double salary : salary) {
            media += salary;
        }
        media = media / salary.length;

        System.out.println("\nMedia salarial: " + media);
    }
}
