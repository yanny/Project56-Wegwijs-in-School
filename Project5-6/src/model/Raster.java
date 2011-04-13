package model;

public class Raster {
	Long id;
	int breedte, hoogte;
	Vak[][] vakjes;
	Vertex vertex;
	
	public Raster() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}

	public int getHoogte() {
		return hoogte;
	}

	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;
	}

	public Vak[][] getVakjes() {
		return vakjes;
	}

	public void setVakjes(Vak[][] vakjes) {
		this.vakjes = vakjes;
	}

	public Vertex getVertex() {
		return vertex;
	}

	public void setVertex(Vertex vertex) {
		this.vertex = vertex;
	}
}
