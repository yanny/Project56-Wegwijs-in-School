package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "lokaal")
public class Lokaal {
	@DatabaseField(generatedId = true, columnName = "lokaalID")
	private Long id;
	@DatabaseField
	private String naam;
	@DatabaseField
	private String lokaalcode;
	@DatabaseField
	private String beschrijving;

	@DatabaseField(foreign = true, columnName = "verdiepingID")
	private Verdieping verdieping;

	@DatabaseField(foreign = true, columnName = "vakMetDeurID")
	private Vak vakjeMetDeur;

	public Lokaal() {

	}

	public Lokaal(String lokaalcode, String naam, Verdieping verdieping) {
		this.lokaalcode = lokaalcode;
		this.naam = naam;
		this.verdieping = verdieping;
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

}
