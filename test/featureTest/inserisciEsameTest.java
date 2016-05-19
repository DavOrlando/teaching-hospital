package featureTest;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import model.Esame;
import model.Medico;
import model.Paziente;
import model.THWeb;
import model.TeachingHospital;
import model.TipologiaEsame;

public class inserisciEsameTest {
	private static final Date MAGGIO_23_2016 = new Date(2016, 5, 23);
	private static final Date MAGGIO_22_2016 = new Date(2016, 5, 22);
	private THWeb thweb;
	private TeachingHospital teachingHospital;
	private Paziente paziente;
	private Medico medico;
	private TipologiaEsame tipologiaEsameCorrente;

	@Before
	public void setUp() throws Exception {
		this.teachingHospital = new TeachingHospital();
		this.thweb = this.teachingHospital.getThWeb();
		this.medico = new Medico("Giovanni", "Rana", "Cardiologia");
		this.tipologiaEsameCorrente = new TipologiaEsame("Visita cardiologica", "Una visita...", (float) 50);
		this.paziente = new Paziente("Mario", "Rossi", "MRRSS94D12H492J", "Via del Corso 12", new Date(1994, 12, 21), "laMiaPassword", "mario@test.com");

		this.teachingHospital.addPaziente(this.paziente);
		this.teachingHospital.addMedico(this.medico);
		this.thweb.inserisciEsame(this.paziente.getCodiceFiscale(), this.medico.getCodice(), MAGGIO_22_2016);

		
	}

	@Test
	public void nessunEsameAggiuntoAlPazienteTest() {
		assertFalse(this.paziente.getEsamiDaSostenere().isEmpty());
	}

	//TODO controlla topologiaEsame
	@Test
	public void unEsameAggiuntoTest() {
		assertFalse(this.paziente.getEsamiDaSostenere().isEmpty());
	}

	@Test
	public void dueEsamiDiversiAggiuntiTest() {
		this.thweb.inserisciEsame(this.paziente.getCodiceFiscale(), this.medico.getCodice(), MAGGIO_23_2016);
		assertEquals(2, this.paziente.getEsamiDaSostenere().size());
	}
	
	@Test //da valutare
	public void dueEsamiUgualiAggiuntiTest() {
		this.thweb.inserisciEsame(this.paziente.getCodiceFiscale(), this.medico.getCodice(), MAGGIO_22_2016);
		assertEquals(2, this.paziente.getEsamiDaSostenere().size());
	}
	
	@Test
	public void verificaDocenteCheSosterràEsame(){
		assertEquals(medico,this.paziente.getEsamiDaSostenere().get(0).getMedico());
	}
	
	
	
	
}
