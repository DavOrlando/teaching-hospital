package model;

public class LineaRisultato {

	private String valore;
	
	public LineaRisultato() {
		// TODO Auto-generated constructor stub
	}

	public LineaRisultato(String valore) {
		this.valore = valore;
	}

	public String getValore() {
		return valore;
	}

	public void setValore(String valore) {
		this.valore = valore;
	}
	
	
	//TODO equals e hashcode sul valore
	
	@Override
	public boolean equals(Object obj) {
		LineaRisultato linea = (LineaRisultato)obj;
		return this.getValore().equals(linea.getValore());
	}
	  
	@Override
	public int hashCode() {
		return this.getValore().hashCode();
	}
	
}
