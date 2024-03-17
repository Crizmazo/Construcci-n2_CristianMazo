package app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import app.config.MYSQLConnection;
import app.dto.PetsDto;

public class PetsDapImpl {
	public Connection connection = MYSQLConnection.getConnection();
	//@Override
	public void createPets(PetsDto petsDto) throws Exception {
		String query = "INSERT INTO Pets(NAME,OWER,ID,WEIGHT,AGE,BREED,REGISTERDATE) VALUES (?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		int i = 1;
		preparedStatement.setString(i++,petsDto.getName());
		preparedStatement.setInt(i++,petsDto.getAge());
		preparedStatement.setDate(i++, petsDto.getRegisterDate());
		/*preparedStatement.setInt(i++, materialDto.getActQuantity());
		preparedStatement.setInt(i++, materialDto.getQuantity());
		preparedStatement.setDate(i++, materialDto.getRegisterDate());
		preparedStatement.execute();
		preparedStatement.close();*/

	}
}
