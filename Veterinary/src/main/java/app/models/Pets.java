package app.models;
import java.sql.Date;

import app.dto.PersonDto;
public class Pets {
		private long id;
		private PersonDto owner;
		private String name;
		private Date registerDate;
		private int age;
		private double weight;
		private String breed;
		private String species;
		private String characteristics;
		
		public Pets() {
			this.registerDate=new Date(System.currentTimeMillis());
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public PersonDto getOwner() {
			return owner;
		}

		public void setOwner(PersonDto owner) {
			this.owner = owner;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Date getRegisterDate() {
			return registerDate;
		}

		public void setRegisterDate(Date registerDate) {
			this.registerDate = registerDate;
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
