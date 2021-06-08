package javaCamp.HRMSProject.entities.concretes;




import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="job_advertisements")
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resumes"})
public class JobAdvertisement {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="job_description")
	private String jobDescrption;
	
	@Column(name="salary")
	private int salary;
	
	@Column(name="number_of_open_position")
	private int numberOfOpenPosition;
	
	@Column(name= "application_deadline")
	private Date applicationDeadline;
	
	@Column(name="status")
	private boolean status;
	
	@Column(name="publication_date")
	private Date publicationDate;
	
	
	@ManyToOne()
	@JoinColumn(name="job_title_id")
	private JobTitle jobTitle;
	
	@ManyToOne()
	@JoinColumn(name="user_id")
	private Employer employer;

	//cascade = CascadeType.ALL
	@ManyToOne()
	@JoinColumn(name="city_id")
	private City city;
}
