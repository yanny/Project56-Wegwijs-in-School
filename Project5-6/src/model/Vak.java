package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "vak")
public class Vak {
	@DatabaseField(generatedId = true, columnName = "vakID", id=true)
	Long id;
	@DatabaseField
	int rij;
	@DatabaseField
	int kolom;
	@DatabaseField(foreign = true, columnName = "navigatiePuntID")
	NavigatiePunt navigatiePunt;
	@DatabaseField(foreign = true, columnName = "lokaalID")
	Lokaal lokaal;
	@DatabaseField(foreign = true, columnName = "rasterID")
	Raster raster;
	@DatabaseField
	boolean heeftDeur;
	@DatabaseField
	int breedte;
	@DatabaseField(foreign=true, columnName="vleugelID")
	private Vleugel navigatieNaarvleugel;

	
	public Vak() {

	}

	public Vak(int rij, int kolom, Raster raster, int breedte) {
		this.rij = rij;
		this.kolom = kolom;
		this.raster = raster;
		this.breedte = breedte;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRij() {
		return rij;
	}

	public void setRij(int rij) {
		this.rij = rij;
	}

	public int getKolom() {
		return kolom;
	}

	public void setKolom(int kolom) {
		this.kolom = kolom;
	}

	public NavigatiePunt getNavigatiePunt() {
		return navigatiePunt;
	}

	public void setNavigatiePunt(NavigatiePunt navigatiePunt) {
		this.navigatiePunt = navigatiePunt;
	}

	public Lokaal getLokaal() {
		return lokaal;
	}

	public void setLokaal(Lokaal lokaal) {
		this.lokaal = lokaal;
	}

	public Raster getRaster() {
		return raster;
	}

	public void setRaster(Raster raster) {
		this.raster = raster;
	}

	public boolean isHeeftDeur() {
		return heeftDeur;
	}

	public void setHeeftDeur(boolean heeftDeur) {
		this.heeftDeur = heeftDeur;
	}

	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}
	public Vleugel getNavigatieNaarvleugel() {
		return navigatieNaarvleugel;
	}

	public void setNavigatieNaarvleugel(Vleugel navigatieNaarvleugel) {
		this.navigatieNaarvleugel = navigatieNaarvleugel;
	}

}
