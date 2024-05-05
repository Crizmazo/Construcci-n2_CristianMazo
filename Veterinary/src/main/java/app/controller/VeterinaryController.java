package app.controller;
import java.util.Scanner;
import app.validators.PersonInputsValidator;
import app.validators.PetsInputsValidator;
//import app.dto.MaterialDto;
import app.dto.PersonDto;
import app.dto.PetsDto;
import app.service.VetService;
import app.service.VeterinaryService;
public class VeterinaryController {
private PersonInputsValidator personInputValidator=new PersonInputsValidator();
private PetsInputsValidator petsInputsValidator= new PetsInputsValidator();
private static Scanner reader = new Scanner(System.in);
private static VeterinaryService veterinaryService = new VetService();
private static final String MENU = "ingrese\n1.Para crear Dueño \n2.Para Ingresar mascota \n3.Para crear Historia \n 4.Cerrar sesion";

private void createUser() throws Exception {
	System.out.println("ingrese el nombre completo");
	String fullName = reader.nextLine();
	personInputValidator.fullNameValidator(fullName);
	System.out.println("ingrese la cedula ");
	Long id = personInputValidator.idValidator(reader.nextLine());
	System.out.println("ingrese el rol completo");
	String role = reader.nextLine();
	personInputValidator.fullNameValidator(role);
	System.out.println("ingrese nombre de usuario");
	String userName = reader.nextLine();
	personInputValidator.fullNameValidator(userName);
	System.out.println("ingrese la contraseña");
	String password = reader.nextLine();
	personInputValidator.fullNameValidator(password);
	PersonDto personDto = new PersonDto(id, fullName, role, userName, password);
	
	veterinaryService.createUser(personDto);
	
}
private void createPets() throws Exception{
	System.out.println("Ingrese el nombre de la mascota");
	String name = reader.nextLine();
	petsInputsValidator.nameValidator(name);
	System.out.println("Ingrese Id de la mascota");
	long id = Long.parseLong(reader.nextLine());
	petsInputsValidator.idValidator(id);
	System.out.println("Dueño id");
	Long owner = personInputValidator.idValidator(reader.nextLine());
	System.out.println("edad de la mascota");
	int age = Integer.parseInt(reader.nextLine());
	System.out.println("Peso de la mascota");
	double weight =Double.parseDouble(reader.nextLine());
	System.out.println("Raza");
	String breed = reader.nextLine();
	System.out.println("Especie de la mascota");
	String species = reader.nextLine();
	String characteristics = reader.nextLine();
	
	PetsDto petsDto = new PetsDto(id, name, age, weight,breed,species,characteristics);
	veterinaryService.createPets(petsDto);
	
	
}
private void createHistory()throws Exception{
	System.out.println("Ingrese el nombre de la mascota");
	
}
	

public void session() {
	boolean runApp = true;
	while (runApp) {
		try {
			System.out.println(MENU);
			String option = reader.nextLine();
			runApp=menu(option);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}

private boolean menu(String option) throws Exception{
	switch (option) {
	case "1":{
		createUser();
		return true;
	}
	case "2": {
		createPets();
		return true;
	}
	case "3": {
		createHistory();
		return true;
	}
	default :{
		System.out.println("ingrese una opcion valida");
		return true;
	}
	}
}

}
