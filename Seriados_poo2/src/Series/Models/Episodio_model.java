package Series.Models;

public class Episodio_model {

	private String nome;
	private int temporada;
	private int ano;
	private boolean assistido;
	private int nota;
	
	public Episodio_model(String nome, boolean assistido, int temporada, int ano, int nota) {
		this.nome = nome;
		this.assistido = assistido;
		this.temporada = temporada;
		this.ano = ano;
		this.nota = nota;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public boolean getAssistido() {
		return assistido;
	}

	public void setAssistido(boolean assistido) {
		this.assistido = assistido;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	
}
