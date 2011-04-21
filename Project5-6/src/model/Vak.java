package model;

public class Vak {
	Long id;
	int rij, kolom;
	NavigatiePunt navigatiePunt;
	Lokaal lokaal;
	Raster raster;
	boolean heeftDeur;
	
	public Vak() {
		
	}
	public Vak(int rij, int kolom, Raster raster) {
		this.rij = rij;
		this.kolom = kolom;
		this.raster = raster;
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


}
