package stud.devdojo.youtube.poo.domain;

public class Professor {
    private String name;
    private String speciality;
    private Seminario[] seminaries;

    public Professor(String name) {
        this.name = name;
    }

    public Professor(String name, String speciality) {
        this.speciality = speciality;
        this.name = name;
    }

    public Professor(String name, Seminario[] seminarios, String speciality) {
        this.name = name;
        this.seminaries = seminarios;
        this.speciality = speciality;
    }

    public void print() {
        System.out.println("---------- PROFESSOR ----------");
        System.out.println("Name: " + name);
        System.out.println("Speciality: " + speciality);
        if (this.seminaries == null) return;
        System.out.println("Seminaries: ");
        for (Seminario seminario : seminaries) {
            System.out.println(seminario.getTitle());
            System.out.println(seminario.getLocal().getAdress());
            System.out.println("*** Alunos ***");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println(aluno.getName() + " - " + aluno.getAge() + " anos");
            }
        }
    }

    public Seminario[] getSeminaries() {
        return seminaries;
    }

    public void setSeminaries(Seminario[] seminaries) {
        this.seminaries = seminaries;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
