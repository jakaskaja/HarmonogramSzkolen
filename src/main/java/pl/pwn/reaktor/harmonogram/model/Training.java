package pl.pwn.reaktor.harmonogram.model;

import java.time.LocalDate;

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
		
		private String l_days;

		public Training(int id_t, String name, String type, String akronim, String start_date, String l_days) {
			super();
			this.id_t = id_t;
			this.name = name;
			this.type = type;
			this.akronim = akronim;
			this.start_date = start_date;
			this.l_days = l_days;
		}

		public Training(String name, String type, String akronim, String start_date, String l_days) {
			super();
			this.name = name;
			this.type = type;
			this.akronim = akronim;
			this.start_date = start_date;
			this.l_days = l_days;
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

		public String getL_days() {
			return l_days;
		}

		public void setL_days(String l_days) {
			this.l_days = l_days;
		}

		@Override
		public String toString() {
			return "Training [id_t=" + id_t + ", name=" + name + ", type=" + type + ", akronim=" + akronim
					+ ", start_date=" + start_date + ", l_days=" + l_days + "]";
		}

		
}

		