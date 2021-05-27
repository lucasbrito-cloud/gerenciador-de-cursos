package br.com.lucas;

public class Aula implements Comparable<Aula>{
	
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		super();
		this.titulo = titulo;
		this.tempo = tempo;
	}
	public String getTitulo () {
		return titulo;
	}
    public int getTempo () {
    	return tempo;
    }
    
    public String toString() {
    	return "[Aula: " + this.titulo + ", " + this.tempo + " minutos]";
    	
    }
    
    public int compareTo(Aula outraAula) {
        return this.titulo.compareTo(outraAula.titulo); }
}
