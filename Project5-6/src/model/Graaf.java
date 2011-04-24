package model;

import java.util.Iterator;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "graaf")
public class Graaf {

	@DatabaseField(generatedId = true, columnName = "graafID")
	private Long id;

	@ForeignCollectionField
	private ForeignCollection<Vertex> vertices;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Haalt vertex op van een bepaalde vleugel
	 * 
	 * @param vleugel
	 * @return
	 */
	public Vertex getVertex(Vleugel vleugel) {
		Vertex gevonden = null;
		Iterator it = vertices.iterator();
		while (it.hasNext()) {
			Vertex v = (Vertex) it.next();
			if (v.getVleugel() == vleugel) {
				gevonden = v;
			}
		}
		return gevonden;
	}

	public ForeignCollection<Vertex> getVertices() {
		return vertices;
	}

	public void setVertices(ForeignCollection<Vertex> vertices) {
		this.vertices = vertices;
	}

	public Graaf() {

	}

}
