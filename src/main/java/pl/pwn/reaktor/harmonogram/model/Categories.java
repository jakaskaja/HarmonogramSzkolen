package pl.pwn.reaktor.harmonogram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cat;
	
	private int id_t;
	
	private String cat_name;

	public Categories(int id_cat, int id_t, String cat_name) {
		super();
		this.id_cat = id_cat;
		this.id_t = id_t;
		this.cat_name = cat_name;
	}

	public Categories(int id_t, String cat_name) {
		super();
		this.id_t = id_t;
		this.cat_name = cat_name;
	}

	public Categories() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public int getId_t() {
		return id_t;
	}

	public void setId_t(int id_t) {
		this.id_t = id_t;
	}

	public String getCat_name() {
		return cat_name;
	}

	public void setCat_name(String cat_name) {
		this.cat_name = cat_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cat_name == null) ? 0 : cat_name.hashCode());
		result = prime * result + id_cat;
		result = prime * result + id_t;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categories other = (Categories) obj;
		if (cat_name == null) {
			if (other.cat_name != null)
				return false;
		} else if (!cat_name.equals(other.cat_name))
			return false;
		if (id_cat != other.id_cat)
			return false;
		if (id_t != other.id_t)
			return false;
		return true;
	}
	
	

}
