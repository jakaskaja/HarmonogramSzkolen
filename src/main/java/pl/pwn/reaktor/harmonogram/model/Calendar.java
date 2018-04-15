package pl.pwn.reaktor.harmonogram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Calendar {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cal;
	
	private int id_cat;
	
	private String date;

	public Calendar(int id_cal, int id_cat, String date) {
		super();
		this.id_cal = id_cal;
		this.id_cat = id_cat;
		this.date = date;
	}

	public Calendar(int id_cat, String date) {
		super();
		this.id_cat = id_cat;
		this.date = date;
	}

	public Calendar() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_cal() {
		return id_cal;
	}

	public void setId_cal(int id_cal) {
		this.id_cal = id_cal;
	}

	public int getId_cat() {
		return id_cat;
	}

	public void setId_cat(int id_cat) {
		this.id_cat = id_cat;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + id_cal;
		result = prime * result + id_cat;
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
		Calendar other = (Calendar) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id_cal != other.id_cal)
			return false;
		if (id_cat != other.id_cat)
			return false;
		return true;
	}
	
	
}
