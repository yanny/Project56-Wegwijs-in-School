package model;

public class Lokaal {
	Long id;
	String naam;
	String lokaalcode;
	String beschrijving;
	Verdieping verdieping;
	Vak vakjeMetDeur;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getLokaalcode() {
		return lokaalcode;
	}

	public void setLokaalcode(String lokaalcode) {
		this.lokaalcode = lokaalcode;
	}

	public String getBeschrijving() {
		return beschrijving;
	}

	public void setBeschrijving(String beschrijving) {
		this.beschrijving = beschrijving;
	}

	public Verdieping getVerdieping() {
		return verdieping;
	}

	public void setVerdieping(Verdieping verdieping) {
		this.verdieping = verdieping;
	}

	public Vak getVakjeMetDeur() {
		return vakjeMetDeur;
	}

	public void setVakjeMetDeur(Vak vakjeMetDeur) {
		this.vakjeMetDeur = vakjeMetDeur;
	}

	public Lokaal() {
		
	}
}
