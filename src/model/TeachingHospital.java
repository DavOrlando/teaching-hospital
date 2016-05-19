package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TeachingHospital {

	private THWeb thWeb;
	private Map<String, TipologiaEsame> tipologieEsame;
	private Map<String, Paziente> pazienti;
	private Map<String, Medico> medici;

	public TeachingHospital() {
		this.thWeb = new THWeb(this);
		this.tipologieEsame = new HashMap<String, TipologiaEsame>();
		this.pazienti = new HashMap<>();
		this.medici = new HashMap<>();
	}

	public TeachingHospital(THWeb thWeb) {
		this.thWeb = thWeb;
	}

	public THWeb getThWeb() {
		return thWeb;
	}

	public void setThWeb(THWeb thWeb) {
		this.thWeb = thWeb;
	}

	public List<TipologiaEsame> getAllTipologieEsami() {
		return new ArrayList<TipologiaEsame>(this.tipologieEsame.values());
	}

	public TipologiaEsame getTipologiaEsame(String codiceTipologia) {
		return this.tipologieEsame.get(codiceTipologia);

	}

	public Medico getMedico(String codiceMedico) {
		return this.medici.get(codiceMedico);
	}

	public Paziente getPaziente(String codiceFiscale) {
		return this.pazienti.get(codiceFiscale);
	}
	
	public List<Paziente> getAllPazienti(){
		return new ArrayList<Paziente>(this.pazienti.values());
	}

	public void addMedico(Medico medico) {
		this.medici.put(medico.getCodice(), medico);
	}

	public void addPaziente(Paziente paziente) {
		this.pazienti.put(paziente.getCodiceFiscale(),paziente);
	}

}
