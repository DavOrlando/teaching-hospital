package model;

public class NormaDiPreparazione {
	private String nome;
	private String descrizione;
	
	public NormaDiPreparazione() {
		// TODO Auto-generated constructor stub
	}
	
	public NormaDiPreparazione(String nome, String descrizione) {
		this.nome = nome;
		this.descrizione = descrizione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	
	//TODO equals e hashcode sul nome
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


}
