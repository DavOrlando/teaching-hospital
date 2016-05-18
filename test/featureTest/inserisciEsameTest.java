package featureTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

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

		this.teachingHospital.getPaziente(this.paziente);
		this.teachingHospital.addMedico(this.medico);
	}

	@Test
	public void nessunEsameAggiuntoAlPazienteTest() {
		assertTrue(this.paziente.getEsamiDaSostenere().isEmpty());
		assertTrue(this.medico.getEsamiDaSostenere().isEmpty());
	}

	@Test
	public void unEsameAggiuntoTest() {
		this.thweb.inserisciEsame(this.paziente.getCodiceFiscale(), this.medico.getCodice(), MAGGIO_22_2016);
		assertFalse(this.paziente.getEsamiDaSostenere().isEmpty());
		assertFalse(this.medico.getEsamiDaSostenere().isEmpty());
		assertEquals(this.medico, this.paziente.getEsamiDaSostenere().get(0).getMedico());
	}

	@Test
	public void dueEsamiAggiuntiTest() {
		this.thweb.inserisciEsame(this.paziente.getCodiceFiscale(), this.medico.getCodice(), MAGGIO_22_2016);
		this.thweb.inserisciEsame(this.paziente.getCodiceFiscale(), this.medico.getCodice(), MAGGIO_23_2016);
		assertEquals(2, this.medico.getEsamiDaSostenere().size());
		assertEquals(2, this.paziente.getEsamiDaSostenere().size());
	}
}
