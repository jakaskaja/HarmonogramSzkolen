package pl.pwn.reaktor.harmonogram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TrainingCouch {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tc;

	private int id_cal;
	
	private int id_user;

	public TrainingCouch(int id_tc, int id_cal, int id_user) {
		super();
		this.id_tc = id_tc;
		this.id_cal = id_cal;
		this.id_user = id_user;
	}

	public TrainingCouch(int id_cal, int id_user) {
		super();
		this.id_cal = id_cal;
		this.id_user = id_user;
	}

	public TrainingCouch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_tc() {
		return id_tc;
	}

	public void setId_tc(int id_tc) {
		this.id_tc = id_tc;
	}

	public int getId_cal() {
		return id_cal;
	}

	public void setId_cal(int id_cal) {
		this.id_cal = id_cal;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_cal;
		result = prime * result + id_tc;
		result = prime * result + id_user;
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
		TrainingCouch other = (TrainingCouch) obj;
		if (id_cal != other.id_cal)
			return false;
		if (id_tc != other.id_tc)
			return false;
		if (id_user != other.id_user)
			return false;
		return true;
	}
	
	

}
