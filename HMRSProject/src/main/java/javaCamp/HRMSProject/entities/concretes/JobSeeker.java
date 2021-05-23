package javaCamp.HRMSProject.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="JobSeekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="lastName")
	private String lastName;
	
	@Column(name="nationalityId")
	private String naionalityId;
	
	@Column(name="birthYear")
	private int birthYear;
	
	@Column(name="eMail")
	private String eMail;
	
	@Column(name="password")
	private String password;
	

}
