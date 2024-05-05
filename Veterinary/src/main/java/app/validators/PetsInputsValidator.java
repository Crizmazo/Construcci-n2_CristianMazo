package app.validators;

public class PetsInputsValidator extends InputsValidator {
public void nameValidator(String name) throws Exception{
	super.stringValidator(name, "Nombre de mascota");
}
public long idValidator(String number) throws Exception{
	return super.longValidator(number, "id de la mascota");
}
public double weightInputsValidator(String weight) throws Exception {
   return super.doubleValidator(weight, "Peso de la mascota");
}
public void breedInputsValidator(String breed) throws Exception {
	   super.stringValidator(breed, "Raza de la mascota");
	   
	}
public void SpeciesInputsValidator(String species) throws Exception {
	   super.stringValidator(species, "Especie");
}
public void CharacteristicsInputsValidator(String characteristics) throws Exception {
	   super.stringValidator(characteristics, "Raza de la mascota");
}
public void idValidator(long id) {
	// TODO Auto-generated method stub
	
}
}
