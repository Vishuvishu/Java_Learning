package myPackage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDaoImp implements UserDao {

	@Override
	public boolean isValidUser(String username, String password) {
		QueryAllForME queryhere = new QueryAllForME();
		String query = queryhere.validuser;
	    	 try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	            preparedStatement.setString(1, username);
	            preparedStatement.setString(2, password);

	            ResultSet resultSet = preparedStatement.executeQuery();
	            System.out.println("query runned for valid user");
	            return resultSet.next();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }

	}

	 @Override
	    public boolean addUser(User user) {
	     QueryAllForME queryall = new QueryAllForME();  
		 String query = queryall.addusere;

	        try (Connection connection = DBUtil.getConnection();
	             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

	            preparedStatement.setString(1, user.getUsername());
	            preparedStatement.setString(2, user.getEmail());
	            preparedStatement.setString(3, user.getPassword());

	            int rowsAffected = preparedStatement.executeUpdate();
	            	System.out.println("user added");
	            return rowsAffected > 0;
	        } catch (SQLException e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	@Override
	public boolean clean() {
		 QueryAllForME queryall = new QueryAllForME();  
		 String query = queryall.clean;
		 
		 try (Connection connection = DBUtil.getConnection();
				 Statement stm = connection.createStatement();) {

			 
			            int RowAffected = stm.executeUpdate(query);
			            System.out.println("clean query runned for removing data with id null");
			            return RowAffected>0;
			            
			        } catch (SQLException e) {
			            e.printStackTrace();
			            return false;
			        }

	}

}
