package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "raster")
public class Raster {

	@DatabaseField(generatedId = true, columnName = "rasterID")
	private Long id;
	@DatabaseField
	private int breedte;
	@DatabaseField
	private int hoogte;

	@DatabaseField(foreign = true, columnName = "vakID")
	private Vak[][] vakjes;
	@DatabaseField(foreign = true, columnName = "vertexID")
	private Vertex vertex;
	@DatabaseField(foreign = true, foreignAutoRefresh = true)
	private Vleugel vleugel;

	public Raster() {
	}

	public Raster(int breedte, int hoogte) {
		vakjes = new Vak[hoogte][breedte];
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

	public Vleugel getVleugel() {
		return vleugel;
	}

	public void setVleugel(Vleugel vleugel) {
		this.vleugel = vleugel;
	}
}
