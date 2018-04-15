package pl.pwn.reaktor.harmonogram.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Training {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id_t;

		private String name;

		private String type;
		
		private String akronim;
		
		private String start_date;

		public Training(String name, String type, String akronim, String start_date) {
			super();
			this.name = name;
			this.type = type;
			this.akronim = akronim;
			this.start_date = start_date;
		}

		public Training(int id_t, String name, String type, String akronim, String start_date) {
			super();
			this.id_t = id_t;
			this.name = name;
			this.type = type;
			this.akronim = akronim;
			this.start_date = start_date;
		}

		public Training() {
			super();
		}

		public int getId_t() {
			return id_t;
		}

		public void setId_t(int id_t) {
			this.id_t = id_t;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getAkronim() {
			return akronim;
		}

		public void setAkronim(String akronim) {
			this.akronim = akronim;
		}

		public String getStart_date() {
			return start_date;
		}

		public void setStart_date(String start_date) {
			this.start_date = start_date;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((akronim == null) ? 0 : akronim.hashCode());
			result = prime * result + id_t;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((start_date == null) ? 0 : start_date.hashCode());
			result = prime * result + ((type == null) ? 0 : type.hashCode());
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
			Training other = (Training) obj;
			if (akronim == null) {
				if (other.akronim != null)
					return false;
			} else if (!akronim.equals(other.akronim))
				return false;
			if (id_t != other.id_t)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (start_date == null) {
				if (other.start_date != null)
					return false;
			} else if (!start_date.equals(other.start_date))
				return false;
			if (type == null) {
				if (other.type != null)
					return false;
			} else if (!type.equals(other.type))
				return false;
			return true;
		}
		
		
}
