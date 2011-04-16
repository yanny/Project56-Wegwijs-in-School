package model;

public class Edge {
	private Long id;
	private Vertex target;
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

	void setTarget(Vertex target) {
		this.target = target;
	}

	Vertex getTarget() {
		return target;
	}
}
