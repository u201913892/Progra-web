package pe.edu.upc.Meetus.models.entities;

import java.util.List;

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

@Entity
@Table(name = "Appreciation")
public class Appreciation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Appreciation_id",columnDefinition = "NUMERIC(10)")
	private Integer id;
	
	@Column(name = "A_review", length = 50)
	private String review;

	@Column(name = "A_Punctuation", length = 2)
	private String puntuation;

	@Column(name = "Meeting_M_Id", length = 2)
	private MeetingT meeting;
	
	
	private Guest guest;
	
	
	
	
}
