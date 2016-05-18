package model;

import java.util.ArrayList;
import java.util.List;

public class Medico {
	private String nome;
	private String cognome;
	private String codice;
	private String password;
	private String specializzazione;
	private List<Esame> esamiDaSostenere;

	public Medico(String nome, String cognome, String codice, String password, String specializzazione) {
		this.nome = nome;
		this.cognome = cognome;
		this.codice = codice;
		this.password = password;
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

	public String getCodice() {
		return codice;
	}

	public void setCodice(String codice) {
		this.codice = codice;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSpecializzazione() {
		return specializzazione;
	}
	
	@Override
	public int hashCode() {
		return this.codice.hashCode();
	}


	@Override
	public boolean equals(Object obj) {
		Medico medico = (Medico) obj;
		return this.getCodice().equals(medico.getCodice());
	}

	
	public void addEsame(Esame esame) {
		this.esamiDaSostenere.add(esame);
	}

	public List<Esame> getEsamiDaSostenere() {
		return this.esamiDaSostenere;
	}
}
