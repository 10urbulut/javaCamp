package javaCamp.HRMSProject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertisements"})
@Data
@Entity
@Table(name="job_titles")
@AllArgsConstructor
@NoArgsConstructor

public class JobTitle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_title_id")
	private int id;
	
	@Column(name="job_name")
	private String jobName;
	
	@OneToMany(mappedBy ="jobTitle",cascade = CascadeType.ALL)
	private List<JobAdvertisement> jobAdvertisements;


	
}
