package javaCamp.HRMSProject.entities.concretes;

import java.sql.Date;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","resume"})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_informations")

@EqualsAndHashCode(callSuper =false )
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
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "reseume_id")
	private Resume resume;

}
