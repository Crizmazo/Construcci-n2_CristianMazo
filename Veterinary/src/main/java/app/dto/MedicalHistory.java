package app.dto;

public class MedicalHistory {
	private String History;
	private PetsDto pets;
	public String getHistory() {
		return History;
	}
	public void setHistory(String history) {
		History = history;
	}
	public PetsDto getPets() {
		return pets;
	}
	public void setPets(PetsDto pets) {
		this.pets = pets;
	}
	public MedicalHistory(String history, PetsDto pets) {
		super();
		History = history;
		this.pets = pets;
	}
	public MedicalHistory() {
		
	}
    
}
