package models;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Personel {
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private Date birthOfDate;
	private String personelNumber;
	
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
		return personelNumber;
	}
	public void setPersonelNumber(String personelNumber) {
		this.personelNumber = personelNumber;
	}
	
	public Personel() {
	
	}
	
	public Personel(int id, String firstName, String lastName, Date birthOfDate, String personelNumber) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfDate = birthOfDate;
		this.personelNumber = personelNumber;
	}
	
	@Override
	public String toString() {
		return "Personel [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", birthOfDate="
				+ birthOfDate + ", personelNumber=" + personelNumber + "]";
	}
	

}
