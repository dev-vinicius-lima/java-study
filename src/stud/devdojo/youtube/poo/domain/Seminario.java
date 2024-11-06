package stud.devdojo.youtube.poo.domain;

public class Seminario {
    private String title;
    private Aluno[] alunos;
    private Local local;

    public Seminario(String title) {
        this.title = title;
    }

    public Seminario(Aluno[] alunos, String title) {
        this.alunos = alunos;
        this.title = title;
    }

    public Seminario(Aluno[] alunos, Local local, String title) {
        this.alunos = alunos;
        this.local = local;
        this.title = title;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public String getTitle() {
        return title;

    }

    public void setTitle(String title) {
        this.title = title;
    }
}
