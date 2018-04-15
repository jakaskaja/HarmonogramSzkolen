package pl.pwn.reaktor.harmonogram.model;


public class TrenerTableRow {
	
	private String date;
	private String group;
	private String topic;
	private String trainer;
	
	public TrenerTableRow(String date, String group, String topic, String trainer) {
		super();
		this.date = date;
		this.group = group;
		this.topic = topic;
		this.trainer = trainer;
	}
	public TrenerTableRow() {
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getTrainer() {
		return trainer;
	}
	public void setTrainer(String trainer) {
		this.trainer = trainer;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((group == null) ? 0 : group.hashCode());
		result = prime * result + ((topic == null) ? 0 : topic.hashCode());
		result = prime * result + ((trainer == null) ? 0 : trainer.hashCode());
		return result;
	}
	
	@Override
	public String toString() {
		return "TrenerTableRow [date=" + date + ", group=" + group + ", topic=" + topic + ", trainer=" + trainer + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrenerTableRow other = (TrenerTableRow) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (group == null) {
			if (other.group != null)
				return false;
		} else if (!group.equals(other.group))
			return false;
		if (topic == null) {
			if (other.topic != null)
				return false;
		} else if (!topic.equals(other.topic))
			return false;
		if (trainer == null) {
			if (other.trainer != null)
				return false;
		} else if (!trainer.equals(other.trainer))
			return false;
		return true;
	}
	
	
	
	
	

}
