package stud.devdojo.youtube.poo.domain;

public class Aluno {
    private String name;
    private int age;
    private Seminario seminario;

    public Aluno(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Aluno(int age, String name, Seminario seminario) {
        this.age = age;
        this.name = name;
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

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
}
