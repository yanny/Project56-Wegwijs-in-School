package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "verdieping")
public class Verdieping {

	@DatabaseField(generatedId = true, columnName = "verdiepingID")
	Long id;
	@DatabaseField
	String naam;
	@DatabaseField(foreign = true, columnName = "graafID")
	Graaf graaf;
	@DatabaseField
	int nummer;

	public Verdieping() {

	}

	public Verdieping(String naam, int nummer) {
		this.naam = naam;
		this.nummer = nummer;
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
