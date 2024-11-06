package stud.devdojo.youtube.poo.domain;

public class Pessoa {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println(getName());
        System.out.println(getAge());
    }
}
