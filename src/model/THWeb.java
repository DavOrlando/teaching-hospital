package model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class THWeb {

	private TeachingHospital teachingHospital;
	private TipologiaEsame tipologiaEsameCorrente;
	private Paziente pazienteCorrente;

	public THWeb(TeachingHospital teachingHospital) {
		this.teachingHospital = teachingHospital;
	}

	public TeachingHospital getTeachingHospital() {
		return teachingHospital;
	}

	public void setTeachingHospital(TeachingHospital teachingHospital) {
		this.teachingHospital = teachingHospital;
	}
	
	public Paziente getPazienteCorrente() {
		return pazienteCorrente;
	}

	public void setPazienteCorrente(Paziente pazienteCorrente) {
		this.pazienteCorrente = pazienteCorrente;
	}

	public List<TipologiaEsame> consultaTipologieEsami() {
		return this.teachingHospital.getAllTipologieEsami();
	}

	public TipologiaEsame scegliTipologia(String codiceTipologia) {
		return this.teachingHospital.getTipologiaEsame(codiceTipologia);
	}

	public void inserisciEsame(String codiceFiscale, String codiceMedico, Date dataEsame) {
		Medico medico = this.teachingHospital.getMedico(codiceMedico);
		Paziente paziente = this.teachingHospital.getPaziente(codiceFiscale);
		Esame esame = new Esame(Calendar.getInstance().getTime(), dataEsame, medico, paziente, tipologiaEsameCorrente);
	}

	public void iniziaInserimentoEsame() {
		// ???
	}

	public void inserisciPaziente(String nome, String cognome, String codiceFiscale, String indirizzo, Date dataNascita,
			String telefono, String email) {
		this.setPazienteCorrente(new Paziente(nome, cognome, codiceFiscale, indirizzo, dataNascita, telefono, email));
	}
	
	public void confermaInserimentoPaziente(Paziente paziente){
		this.teachingHospital.addPaziente(this.getPazienteCorrente());
	}

	

}
