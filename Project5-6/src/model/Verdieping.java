package model;

public class Verdieping {
	Long id;
	String naam;
	Graaf graaf;
	int nummer;
	
	public Verdieping() {
		
	}
	
	public Verdieping(String naam) {
		this.naam = naam;
	}

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

	public Graaf getGraaf() {
		return graaf;
	}

	public void setGraaf(Graaf graaf) {
		this.graaf = graaf;
	}

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
}
