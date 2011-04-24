package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "vleugel")
public class Vleugel {
	@DatabaseField(generatedId = true, columnName = "vleugelID")
	Long id;
	@DatabaseField
	String naam;
	@DatabaseField
	String idNaam;

	// lege constructor ormlite benodigd
	public Vleugel() {
	}

	public Vleugel(String naam, String idNaam) {
		this.naam = naam;
		this.idNaam = idNaam;
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
