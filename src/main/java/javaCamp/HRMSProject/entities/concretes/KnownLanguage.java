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

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="known_languages")
public class KnownLanguage {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="known_language_id")
	private int knownLanguageId;
	
	@Column(name = "language")
	private String language;
	
	@Column(name="language_level")
	private int languageLevel;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "resume_id")
	private Resume resume;
	
}
