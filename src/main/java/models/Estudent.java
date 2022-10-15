package models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "usuario")
public class Estudent {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "addres")
	private String addres;
	
	@Column(name = "age")
	private int age;
	
	public Estudent () {
		
	}
	
	public Estudent(String name, String lastname, String email, String addres, int age) {
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.addres = addres;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return addres;
	}
	public void setAddress(String addres) {
		this.addres = addres;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Estudent [id=" + id + ", name=" + name + ", lastname=" + lastname + ", email=" + email + ", addres="
				+ addres + ", age=" + age + "]";
	}
}
