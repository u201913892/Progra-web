package pe.edu.upc.Meetus.models.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Guest")
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
	
	
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}
