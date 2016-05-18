package model;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class THWeb {

	private TeachingHospital teachingHospital;
	private TipologiaEsame tipologiaEsameCorrente;

	public THWeb(TeachingHospital teachingHospital) {
		this.teachingHospital = teachingHospital;
	}

	public TeachingHospital getTeachingHospital() {
		return teachingHospital;
	}

	public void setTeachingHospital(TeachingHospital teachingHospital) {
		this.teachingHospital = teachingHospital;
	}

	public List<TipologiaEsame> consultaTipologieEsami() {
		return this.teachingHospital.getAllTipologieEsami();
	}
	
	public void iniziaInserimentoEsame() {

	}
	
	public TipologiaEsame scegliTipologia(String codiceTipologia) {
		return this.teachingHospital.getTipologiaEsame(codiceTipologia);
	}

	public void inserisciEsame(String codiceFiscale,String codiceMedico,Date dataEsame){
		Medico medico = this.teachingHospital.getMedico(codiceMedico);
		Paziente paziente = this.teachingHospital.getPaziente(codiceFiscale);
		Esame esame = new Esame(Calendar.getInstance().getTime(), dataEsame, medico, paziente,tipologiaEsameCorrente);
	}
	


}
