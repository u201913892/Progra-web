package pe.edu.upc.Meetus.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

public class Guest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "G_id",columnDefinition = "NUMERIC(10)")
	private Integer id;
	
	@Column(name = "G_name", length = 30)
	private String name;

	@Column(name = "G_lastname", length = 30)
	private String lastname;

	@Column(name = "G_Phone", length = 9)
	private String phone;
	
	@Column(name = "G_DNI", length = 8)
	private String dni;
	
	@Column(name = "G_Address", length = 30)
	private String address;
	
	@Column(name = "G_Email", length = 30)
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "")
	private MeetingT meetingid;
	

}
