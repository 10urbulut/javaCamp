package javaCamp.HRMSProject.entities.concretes;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobSeeker"})
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name="resumes")
@NoArgsConstructor
@AllArgsConstructor

public class Resume  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="resume_id")
	private int resumeId;
	
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume",cascade = CascadeType.ALL)
	private List< JobInformation> jobInformations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume",cascade = CascadeType.ALL)
	private List<Image> images;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume",cascade = CascadeType.ALL)
	private List<EducationInformation> educationInformations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume",cascade = CascadeType.ALL)
	private List<KnownLanguage> knownLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resume",cascade = CascadeType.ALL)
	private List<KnownTechnology> knownTechnologies;
		
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "job_seeker_id")
	private JobSeeker jobSeeker;

	
}
