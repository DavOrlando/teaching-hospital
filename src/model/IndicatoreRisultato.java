package model;

public class IndicatoreRisultato {
	private String nome;
	private Long id;
	
	public IndicatoreRisultato() {
		// TODO Auto-generated constructor stub
	}
	

	public IndicatoreRisultato(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	//TODO equals e hashcode sul nome
	@Override
	public boolean equals(Object obj) {
		IndicatoreRisultato index = (IndicatoreRisultato)obj;
		return this.getNome().equals(index.getNome());
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode();
	}
}
