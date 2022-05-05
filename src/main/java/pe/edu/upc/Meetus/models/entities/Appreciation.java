package pe.edu.upc.Meetus.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getPuntuation() {
		return puntuation;
	}

	public void setPuntuation(String puntuation) {
		this.puntuation = puntuation;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	@ManyToOne
	@JoinColumn(name = "G_id")
	private Guest guest;
	
	
	
	
}
