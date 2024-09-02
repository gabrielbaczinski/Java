package Ajuste_Academico;
import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private String turno;
    private int creditos;
    private String bloco;
    private Professor professor;
    private ArrayList alunos;

    public Disciplina(String nome, String turno, int creditos, String bloco, Professor professor) {
        this.nome = nome;
        this.turno = turno;
        this.creditos = creditos;
        this.bloco = bloco;
        this.professor = professor;
        this.alunos = new ArrayList();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public String printAlunos(){
        System.out.println(alunos);
        return alunos.toString();
    }


}
