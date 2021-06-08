package javaCamp.HRMSProject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","resumes"})
@Entity
@PrimaryKeyJoinColumn(name="user_id")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Table(name="job_seekers")


public class JobSeeker extends User {

	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_Id")
	private String nationalityId;
	
	@Column(name="birth_year")
	private int birthYear;


	@JsonIgnore
	@OneToMany(mappedBy = "jobSeeker",cascade = CascadeType.ALL)
	private List<Resume> resumes;
}
