package model;

public class Vleugel {
	Long id;
	String naam;
	
	public Vleugel() {
		
	}
	
	public Vleugel(String naam) {
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
}
