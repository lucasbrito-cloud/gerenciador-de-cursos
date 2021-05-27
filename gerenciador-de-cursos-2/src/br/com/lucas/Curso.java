package br.com.lucas;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
	
	private static final String aluno = null;
	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
	private Object alunos;

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return  Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) {
        this.aulas.add(aula);
    }
    
    public int getTempoTotal() {
        int tempoTotal = 0;
        for (Aula aula : aulas) {
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;
    }
    
    public String toString() {
        return "[Curso: " + this.getNome() + ", tempo total: " + this.getTempoTotal()
                + ", aulas: + " + this.aulas + "]";
    }

	public void matricula(Aluno aluno) {
		((List<Aula>) this.alunos).addAll((Collection<? extends Aula>) aluno);
		
	}
	
	public <T> Set<Aluno> getAlunos() {
	    return (Set<Aluno>) Collections.unmodifiableSet((Set<? extends T>) alunos);
	}


}
