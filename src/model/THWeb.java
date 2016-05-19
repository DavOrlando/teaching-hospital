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

	public void inserisciEsame(String codiceFiscalePaziente, String codiceMedico, Date dataEsame) {
		Medico medico = this.teachingHospital.getMedico(codiceMedico);
		Paziente paziente = this.teachingHospital.getPaziente(codiceFiscalePaziente);
		Esame esame = new Esame(Calendar.getInstance().getTime(), dataEsame, medico, paziente, this.tipologiaEsameCorrente);
	}

	/***
	 * 
	 */
	public void iniziaInserimentoEsame() {
		// ???
	}

	/***
	 * @param nome
	 * @param cognome
	 * @param codiceFiscale
	 * @param indirizzo
	 * @param dataNascita
	 * @param telefono
	 * @param email
	 * 
	 *Il metodo setta la variabile di istanza pazienteCorrente con il Paziente che viene creato grazie ai parametri
	 *passati come attributo.
	 * 
	 */
	public void inserisciPaziente(String nome, String cognome, String codiceFiscale, String indirizzo, Date dataNascita,
			String telefono, String email) {
		this.setPazienteCorrente(new Paziente(nome, cognome, codiceFiscale, indirizzo, dataNascita, telefono, email));
	}

	/***
	 * 
	 * @param paziente	  
	 *Il metodo inserisce nella mappa dei pazienti di teachingHospital il
	 *paziente passato come parametro
	 */
	public void confermaInserimentoPaziente(Paziente paziente) {
		this.teachingHospital.addPaziente(this.getPazienteCorrente());
	}

}
