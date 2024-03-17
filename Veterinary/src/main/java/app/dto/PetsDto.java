package app.dto;
import java.sql.Date;

import app.models.Pets;
public class PetsDto {
private long id;
private PersonDto owner;
private String name;
private int age;
private double weight;
private String breed;
private String species;
private String characteristics;
private Date registerDate;


public PetsDto(long id, String name, int age, double weight, String breed, String species,
	String characteristics) {
	super();
	this.id = id;
    this.name = name;
	this.age = age;
	this.weight = weight;
	this.breed = breed;
	this.species = species;
	this.characteristics = characteristics;
	this.registerDate=new Date (System.currentTimeMillis());
}
public PetsDto(int id){
	super();
	this.id=id;
}
public PetsDto (Pets pets) {
	this.id=pets.getId();
	this.owner=pets.getOwner();
	this.name = getName();
	this.age = getAge();
	this.weight = getWeight();
	this.breed = getBreed();
	this.species = getSpecies();
	this.characteristics = getCharacteristics();
		
}
public PetsDto() {
	
}
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public PersonDto getOwner() {
	return owner;
}
public void setOwner(PersonDto owner) {
	this.owner = owner;
}
public Date getRegisterDate() {
	return registerDate;
}
public void setRegisterDate(Date registerDate) {
	this.registerDate=registerDate;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public String getBreed() {
	return breed;
}
public void setBreed(String breed) {
	this.breed = breed;
}
public String getSpecies() {
	return species;
}
public void setSpecies(String species) {
	this.species = species;
}
public String getCharacteristics() {
	return characteristics;
}
public void setCharacteristics(String characteristics) {
	this.characteristics = characteristics;
}

}
