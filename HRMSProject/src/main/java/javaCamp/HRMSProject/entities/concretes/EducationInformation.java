package javaCamp.HRMSProject.entities.concretes;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","resumes"})
@Entity
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Table(name="education_informations")

public class EducationInformation  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="education_information_id")
	private int educationInformationId;
	
	@Column(name="school_name")
	private String schoolName;
	
	@Column(name="start_date_of_school")
	private Date startDateOfSchool;
	
	@Column(name="graduation_date")
	private Date graduationDate;
	
	@Column(name="education_status")
	private boolean educationStatus;
	

	@OneToMany()
	@JoinColumn(name = "resume_id")
	private List<Resume> resumes;

}
