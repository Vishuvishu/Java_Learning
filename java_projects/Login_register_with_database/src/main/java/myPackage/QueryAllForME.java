package myPackage;

public class QueryAllForME {
	String validuser = "SELECT * FROM users WHERE username = ? AND password = ?";
	String addusere = "INSERT INTO users (username, email, password) VALUES (?, ?, ?)";
	String clean = "DELETE FROM users WHERE id IS NULL;";
	
}
