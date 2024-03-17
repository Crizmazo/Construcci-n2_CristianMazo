package app.controller;
import java.util.Scanner;

import app.dto.PersonDto;
import app.service.LoginService;
import app.service.VetService;
import app.validators.PersonInputsValidator;

public class LoginController {
	private static Scanner reader = new Scanner(System.in);
	private static PersonInputsValidator personInputValidator = new PersonInputsValidator();
	private static LoginService loginService = new VetService();
	private static VeterinaryController veterinaryController = new VeterinaryController();
	private static AdminController adminController = new AdminController();

	public void login() throws Exception {
		System.out.println("ingrese su usuario");
		String userName = reader.nextLine();
		personInputValidator.userNameValidator(userName);
		System.out.println("ingrese su contraseña");
		String password = reader.nextLine();
		personInputValidator.passwordValidator(password);
		PersonDto personDto = new PersonDto(userName, password);
		loginService.login(personDto);
		loginRouter(personDto);
		loginService.logout();
	}

	private void loginRouter(PersonDto personDto) {
	 if(personDto.getRole().equals("administrador")) {
		adminController.session();
	 }if (personDto.getRole().equals("medico")) {
			veterinaryController.session();
		}else if(personDto.getRole().equals("vendedor")) {
			veterinaryController.session();
	}
		}
}



