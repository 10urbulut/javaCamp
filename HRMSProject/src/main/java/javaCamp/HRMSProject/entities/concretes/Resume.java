package javaCamp.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
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
	

	@Column(name="known_languages")
	private String knownLanguages;
	
	@Column(name="languageLevel")
	private int languageLevel;
	
	@Column(name="image")
	private String image;
	
	@Column(name="github_link")
	private String githubLink;
	
	@Column(name="linkedin_link")
	private String linkedinLink;
	
	@Column(name="known_technologies")
	private String knownTechnologies;
	
	@Column(name="cover_letter")
	private String coverLetter;
	
	@ManyToOne()
	@JoinColumn(name="education_information_id")
	private EducationInformation educationInformation;
	
	@ManyToOne()
	@JoinColumn(name="job_information_id")
	private JobInformation jobInformation;
	

	
}
