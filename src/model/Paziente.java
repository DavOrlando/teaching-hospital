package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Paziente {
	
	private String nome;
	private String cognome;
	private String codiceFiscale;
	private String indirizzo;
	private Date dataNascita;
	private String password;
	private String email;
	private List<Esame> esamiDaSostenere;
	private List<Esame> esamiSostenuti;

	public Paziente(String nome, String cognome, String codiceFiscale, String indirizzo, Date dataNascita,
			String codice, String email) {
		this.nome = nome;
		this.cognome = cognome;
		this.codiceFiscale = codiceFiscale;
		this.indirizzo = indirizzo;
		this.dataNascita = dataNascita;
		this.password = password;
		this.email = email;
		this.esamiDaSostenere = new ArrayList<Esame>();
		this.esamiSostenuti = new ArrayList<Esame>();
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

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public Date getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(Date dataNascita) {
		this.dataNascita = dataNascita;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void addEsame(Esame esame) {
		this.esamiDaSostenere.add(esame);
	}

	public List<Esame> getEsamiDaSostenere() {
		return esamiDaSostenere;
	}

	public List<Esame> getEsamiSostenuti() {
		return esamiSostenuti;
	}
	
 //TODO equals e hashcode sul codiceFiscale
	
	@Override
	public boolean equals(Object obj) {
		Paziente paziente = (Paziente)obj;
		return this.getCodiceFiscale().equals(paziente.getCodiceFiscale());
	}

	@Override
	public int hashCode() {
		return this.getCodiceFiscale().hashCode();
	}

}
