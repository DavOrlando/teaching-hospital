package model;

import java.util.ArrayList;
import java.util.List;

public class ElencoRisultato {
	private List<LineaRisultato> lineeRisultato;
	
	
	public ElencoRisultato() {
		this.lineeRisultato = new ArrayList<>();
	}

	public List<LineaRisultato> getLineeRisultato() {
		return lineeRisultato;
	}

	public void setLineeRisultato(List<LineaRisultato> lineeRisultato) {
		this.lineeRisultato = lineeRisultato;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
