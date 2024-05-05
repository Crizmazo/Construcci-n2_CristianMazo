package app.controller;

import java.util.Scanner;

import app.dto.PersonDto;
import app.service.AdminService;
import app.service.LoginService;
import app.service.VetService;
import app.service.VeterinaryService;
import app.validators.PersonInputsValidator;
import app.controller.*;

public class AdminController {
	private PersonInputsValidator personInputValidator=new PersonInputsValidator();
		private static Scanner reader = new Scanner(System.in);
	private static VeterinaryService veterinaryService = new VetService();
	private static final String MENU = "ingrese\n1.Para crear usuario\n2.Para Cerrar sesion";
private static LoginController loginController = new LoginController();
private static LoginService loginService = new VetService();
	private void createUser() throws Exception {
		System.out.println("ingrese la cedula ");
		Long id = personInputValidator.idValidator(reader.nextLine());
		System.out.println("ingrese el nombre completo");
		String fullName = reader.nextLine();
		personInputValidator.fullNameValidator(fullName);
		System.out.println("ingrese la edad");
		int age = personInputValidator.ageValidator(reader.nextLine());
		System.out.println("ingrese el rol completo");
		String role = reader.nextLine();
		
		
		
		
		
		
		personInputValidator.roleValidator(role);
		System.out.println("ingrese nombre de usuario");
		String userName = reader.nextLine();
		personInputValidator.fullNameValidator(userName);
		System.out.println("ingrese la contraseña");
		String password = reader.nextLine();
		personInputValidator.fullNameValidator(password);
		PersonDto personDto = new PersonDto(id, fullName, role, userName, password);
		
		AdminService.createUser(personDto);
		loginService.login(personDto);
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
			veterinaryService.logout();
			return false;
		}
		
		default :{
			System.out.println("ingrese una opcion valida");
			return true;
		}
		}
	}

}
