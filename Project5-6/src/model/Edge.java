package model;

public class Edge {
	Long id;
	private Vertex target;
	Double gewicht;
	
	public Edge() {
		
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
