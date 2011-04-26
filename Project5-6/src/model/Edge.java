package model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "edge")
public class Edge {
	@DatabaseField(generatedId = true, columnName = "edgeID")
	private Long id;
	@DatabaseField(foreign = true, foreignAutoRefresh = true)
	private Vertex target;
	@DatabaseField
	private Double gewicht;

	public Edge() {

	}

	public Edge(Vertex target, double gewicht) {
		this.target = target;
		this.gewicht = gewicht;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getGewicht() {
		return gewicht;
	}

	public void setGewicht(Double gewicht) {
		this.gewicht = gewicht;
	}

	public Edge(Vertex target, Double gewicht) {
		this.setTarget(target);
		this.gewicht = gewicht;
	}

	public void setTarget(Vertex target) {
		this.target = target;
	}

	public Vertex getTarget() {
		return target;
	}
}
