package model;

import java.util.ArrayList;
import java.util.List;

public class Medico {
	private String nome;
	private String cognome;
	private String specializzazione;
	private List<Esame> esamiDaSostenere;

	public Medico(String nome, String cognome, String specializzazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.specializzazione = specializzazione;
		this.esamiDaSostenere = new ArrayList<>();

	}

	public void setSpecializzazione(String specializzazione) {
		this.specializzazione = specializzazione;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}

	public void addEsame(Esame esame) {
		this.esamiDaSostenere.add(esame);
	}

	public List<Esame> getEsamiDaSostenere() {
		return this.esamiDaSostenere;
	}
	
	
}
