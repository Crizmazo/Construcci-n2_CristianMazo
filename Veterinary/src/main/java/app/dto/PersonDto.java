package app.dto;

import app.models.Person;

public class PersonDto {
	private long id;
	private String fullName;
	private String role;
	private String userName;
	private String password;
	
	public PersonDto(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public PersonDto(long id, String fullName, String role, String userName, String password) {
		this.id = id;
		this.fullName = fullName;
		this.role = role;
		this.userName = userName;
		this.password = password;
	}

	public PersonDto(Person person) {
		this.id = person.getId();
		this.fullName = person.getFullName();
		this.role = person.getRole();
		this.userName = person.getUserName();
		this.password = person.getPassword();
	}

	public PersonDto() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getRole() {
		return role;
	}

	public void setRol(String rol) {
		this.role = rol;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
