package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "vertex")
public class Vertex implements Comparable<Vertex> {
	@DatabaseField(generatedId = true, columnName = "vertexID")
	private Long id;

	@DatabaseField(canBeNull = false, foreign = true)
	private Vleugel vleugel;

	@ForeignCollectionField
	private ForeignCollection<Edge> takken;

	private Double minAfstand = Double.POSITIVE_INFINITY;
	private Vertex vorige;

	@DatabaseField(foreign = true, columnName = "rasterID", foreignAutoRefresh = true)
	private Raster raster;

	@DatabaseField(foreign = true)
	private Graaf graaf;

	public Vertex() {

	}

	public Vertex(Vleugel vleugel) {
		this.vleugel = vleugel;
	}

	public int compareTo(Vertex ander) {
		return Double.compare(minAfstand, ander.minAfstand);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Vleugel getVleugel() {
		return vleugel;
	}

	public void setVleugel(Vleugel vleugel) {
		this.vleugel = vleugel;
	}

	// Voegt een nieuwe tak toe aan deze vertex
	public void addTak(Edge tak) {
		getTakken().add(tak);
	}

	public ForeignCollection<Edge> getTakken() {
		return takken;
	}

	public void setTakken(ForeignCollection<Edge> takken) {
		this.takken = takken;
	}

	public Double getMinAfstand() {
		return minAfstand;
	}

	public void setMinAfstand(Double minAfstand) {
		this.minAfstand = minAfstand;
	}

	public Vertex getVorige() {
		return vorige;
	}

	public void setVorige(Vertex vorige) {
		this.vorige = vorige;
	}

	public Raster getRaster() {
		return raster;
	}

	public void setRaster(Raster raster) {
		this.raster = raster;
	}

	public Graaf getGraaf() {
		return graaf;
	}

	public void setGraaf(Graaf graaf) {
		this.graaf = graaf;
	}

}
