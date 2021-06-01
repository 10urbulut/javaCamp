package javaCamp.HRMSProject.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_informations")
public class JobInformation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="job_information_id")
	private int jobInformationId;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="start_date_of_work")
	private Date startDateOfWork;
	
	@Column(name="job_departure_date")
	private Date jobDepartureDate;
	
	@Column(name="work_status")
	private boolean workStatus;
	
	@Column(name="job_position")
	private String jobPosition;
	
	@OneToMany(mappedBy = "jobInformation")
	private List<Resume> resumes;
	
}
