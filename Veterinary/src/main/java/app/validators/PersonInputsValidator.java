package app.validators;

public class PersonInputsValidator extends InputsValidator {
	public void fullNameValidator(String fullName) throws Exception {
		super.stringValidator(fullName, "nombre de usuario");
	}
public int ageValidator(String age) throws Exception{
	return super.integerValidator(age, "Edad del usuario");
}
	public long idValidator(String number) throws Exception {
		return super.longValidator(number, "id de usuario");
	}
	
	public void roleValidator(String role) throws Exception {
		super.stringValidator(role, "role de usuario");
	}
	
	public void userNameValidator(String userName) throws Exception {
		super.stringValidator(userName, "usuario");
	}
	
	public void passwordValidator(String password) throws Exception {
		super.stringValidator(password, "constraseña de usuario");
	}
}