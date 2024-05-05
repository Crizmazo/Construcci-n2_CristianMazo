package app.dao;
import app.dto.PetsDto;
public interface PetsDao {
	public void createPets(PetsDto petsDto) throws Exception;
	public void updateMaterial(PetsDto petsDto) throws Exception;
	public PetsDto findMaterialById(PetsDto petsDto) throws Exception;
}

