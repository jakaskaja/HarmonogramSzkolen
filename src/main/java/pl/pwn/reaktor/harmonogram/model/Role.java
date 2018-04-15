package pl.pwn.reaktor.harmonogram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_role;

	private String role_name;

	public Role(int id_role, String role_name) {
		super();
		this.id_role = id_role;
		this.role_name = role_name;
	}

	public Role(String role_name) {
		super();
		this.role_name = role_name;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId_role() {
		return id_role;
	}

	public void setId_role(int id_role) {
		this.id_role = id_role;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_role;
		result = prime * result + ((role_name == null) ? 0 : role_name.hashCode());
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
		Role other = (Role) obj;
		if (id_role != other.id_role)
			return false;
		if (role_name == null) {
			if (other.role_name != null)
				return false;
		} else if (!role_name.equals(other.role_name))
			return false;
		return true;
	}
	
	
}
