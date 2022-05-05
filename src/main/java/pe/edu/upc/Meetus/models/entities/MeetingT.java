package pe.edu.upc.Meetus.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Meeting")
public class MeetingT {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "M_Id",columnDefinition = "NUMERIC(10)")
	private Integer id;
	
	@Column(name = "M_Name", length = 30)
	private String name;

	@Column(name = "M_date", length = 10)
	private String date;

	@Column(name = "M_Hour", length = 8)
	private String hour;

	@Column(name = "M_Type", length = 20)
	private String type;
	
	@Column(name = "M_Description", length = 50)
	private String description;
	
	@Column(name = "Local_L_Id", length = 2)
	private Local localid;
	
	@Column(name)

}
