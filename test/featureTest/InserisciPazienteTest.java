package featureTest;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.Paziente;
import model.THWeb;
import model.TeachingHospital;

public class InserisciPazienteTest {

	private Paziente paziente;
	private TeachingHospital teachingHospital;
	private THWeb thWeb;

	@Before
	public void setUp() throws Exception {
		teachingHospital = new TeachingHospital();
		thWeb = new THWeb(teachingHospital);
		paziente = new Paziente("Aldo", "Fabiani", "ASDFG8993", "Viabengasi 39", new Date(1994, 04, 24),
				"6936192639162", "aldarello@test.siw");

	}

	@Test
	public void nessunoPazienteTrovatoTest() {
		assertEquals(null, this.teachingHospital.getPaziente(this.paziente.getCodiceFiscale()));
	}

	@Test
	public void nessunPazienteInTeachingHospital() {
		assertTrue(this.teachingHospital.getAllPazienti().isEmpty());
		assertEquals(0, this.teachingHospital.getAllPazienti().size());
	}

	@Test
	public void inserisciPazienteTest() {
		this.thWeb.inserisciPaziente("Aldo", "Fabiani", "ASDFG8993", "Viabengasi 39", new Date(1994, 04, 24),
				"6936192639162", "aldarello@test.siw");
		assertEquals(paziente, this.thWeb.getPazienteCorrente());
	}

	@Test
	public void confermaInserimentoPaziente() {
		this.thWeb.inserisciPaziente("Aldo", "Fabiani", "ASDFG8993", "Viabengasi 39", new Date(1994, 04, 24),
				"6936192639162", "aldarello@test.siw");
		this.thWeb.confermaInserimentoPaziente(this.thWeb.getPazienteCorrente());
		assertEquals(1, this.teachingHospital.getAllPazienti().size());
	}

	@Test
	public void duePazientiUgualiAggiunti() {
		this.teachingHospital.addPaziente(paziente);
		this.thWeb.inserisciPaziente("Aldo", "Fabiani", "ASDFG8993", "Viabengasi 39", new Date(1994, 04, 24),
				"6936192639162", "aldarello@test.siw");
		this.teachingHospital.addPaziente(this.thWeb.getPazienteCorrente());
		assertEquals(1, this.teachingHospital.getAllPazienti().size());
	}

	@Test
	public void duePazientiDiversiAggiunti() {
		this.teachingHospital.addPaziente(paziente);
		this.thWeb.inserisciPaziente("Ciro", "Davide", "fhgjhkj", "Via roma 3", new Date(1994, 04, 12), "56588",
				"davidenko@test.siw");
		this.thWeb.confermaInserimentoPaziente(this.thWeb.getPazienteCorrente());
		assertEquals(2, this.teachingHospital.getAllPazienti().size());
	}

}