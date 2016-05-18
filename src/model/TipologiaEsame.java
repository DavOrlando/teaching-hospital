package model;

import java.util.List;

public class TipologiaEsame {
	private Long codice;
	private String nome;
	private String descrizione;
	private Float costo;
	private List<NormaDiPreparazione> norme;
	private List<IndicatoreRisultato> indicatoriRisultato;


	public TipologiaEsame() {	}
	
	// TODO il codice per il momento è null
	public TipologiaEsame(String nome, String descrizione, Float costo) {
		this.nome = nome;
		this.descrizione = descrizione;
		this.costo = costo;
		
	}

	public Long getCodice() {
		return codice;
	}
	public void setCodice(Long codice) {
		this.codice = codice;
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
	public Float getCosto() {
		return costo;
	}
	public void setCosto(Float costo) {
		this.costo = costo;
	}


}
