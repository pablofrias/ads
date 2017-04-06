package business;

import com.fasterxml.jackson.annotation.JsonGetter;

public class UserInfo {
	private String name;
	private String surname;
	private int age;
	
	@JsonGetter("name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@JsonGetter("surname")
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	@JsonGetter("age")
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
