package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "navigatiepunt")
public class NavigatiePunt {
	@DatabaseField(generatedId = true, columnName = "navigatiepuntID")
	Long id;
	@DatabaseField
	String naam;

	public NavigatiePunt() {

	}

	public NavigatiePunt(String naam) {
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
