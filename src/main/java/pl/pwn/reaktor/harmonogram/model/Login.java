package pl.pwn.reaktor.harmonogram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_log;
	
	@Column
	private int id_user;
	
	@Column(nullable = false, unique=true)
	private String login;
	
	@Column(nullable = false)
	private String password;

	public Login(int id_log, int id_user, String login, String password) {
		super();
		this.id_log = id_log;
		this.id_user = id_user;
		this.login = login;
		this.password = password;
	}

	public Login(int id_user, String login, String password) {
		super();
		this.id_user = id_user;
		this.login = login;
		this.password = password;
	}

	public Login() {

	}

	public int getId_log() {
		return id_log;
	}

	public void setId_log(int id_log) {
		this.id_log = id_log;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id_log;
		result = prime * result + id_user;
		result = prime * result + ((login == null) ? 0 : login.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
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
		Login other = (Login) obj;
		if (id_log != other.id_log)
			return false;
		if (id_user != other.id_user)
			return false;
		if (login == null) {
			if (other.login != null)
				return false;
		} else if (!login.equals(other.login))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}

	
	

	

}
