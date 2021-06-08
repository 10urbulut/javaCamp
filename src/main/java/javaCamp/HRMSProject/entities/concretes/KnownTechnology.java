package javaCamp.HRMSProject.entities.concretes;

import javax.persistence.CascadeType;
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
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","resume"})
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="known_technologies")

public class KnownTechnology {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="known_technology_id")
	private int knownTechnologyId;
	
	@Column(name = "technology")
	private String technologyName;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "resume_id")
	private Resume resume;

}
