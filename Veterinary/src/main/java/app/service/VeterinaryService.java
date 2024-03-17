package app.service;
import app.dto.MedicalHistory;
import app.dto.PersonDto;
import app.dto.PetsDto;

public interface VeterinaryService {
public abstract void createUser(PersonDto personDto) throws Exception;
public abstract void createPets(PetsDto petsDto) throws Exception;
public abstract void createHistory( MedicalHistory medicalHistory) throws Exception;
public void setSesionID(long sesionId) ;
public void login(PersonDto personDto)throws Exception;	
public void logout() throws Exception;
}
