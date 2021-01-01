package models;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class Persons {
	
	@Id
	@Column(name = "id", unique = true, nullable = false, length = 15)
	private int id;
	
	@Column(name = "firstName", unique = false, nullable = false, length = 15)
	private String firstName;
	
	@Column(name = "lastName", unique = false, nullable = false, length = 15)
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthOfDay")
	private Date birthOfDate;
	
	@Lob
	private String about;
	
	@Transient
	private int salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthOfDate() {
		return birthOfDate;
	}
	public void setBirthOfDate(Date birthOfDate) {
		this.birthOfDate = birthOfDate;
	}
	public String getPersonelNumber() {
		return about;
	}
	public void setPersonelNumber(String personelNumber) {
		this.about = personelNumber;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public Persons() {
	
	}
	
	public Persons(int id, String firstName, String lastName, Date birthOfDate, String about, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.about = about;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Personel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthOfDate="
				+ birthOfDate + ", personelNumber=" + about + "]";
	}
	

}
