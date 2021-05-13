package javaCamp.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import javaCamp.HRMSProject.entities.abstracts.Entity;
import lombok.Data;

@Data
@javax.persistence.Entity
@Table(name="jobTitle")
public class JobTitle implements Entity{
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="jobName")
	private String jobName;
	
	
	public JobTitle() {
		
	}

	public JobTitle(int id, String jobName) {
		super();
		this.id = id;
		this.jobName = jobName;
	}

}
