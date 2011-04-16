package model;

public class Vertex implements Comparable<Vertex> {
	
	private Long id;
	private Vleugel vleugel;
	private Edge[] takken;
	private Double minAfstand = Double.POSITIVE_INFINITY;
	private Vertex vorige;
	private Raster raster;
	
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

	public Edge[] getTakken() {
		return takken;
	}

	public void setTakken(Edge[] takken) {
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
}
