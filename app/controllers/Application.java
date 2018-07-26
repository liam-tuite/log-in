package controllers;

import play.mvc.*;
import java.sql.*;
import views.html.*;
import play.data.*;
import play.db.Database;
import model.*;

import javax.inject.Inject;

public class Application extends Controller {

	@Inject
    private play.data.FormFactory formFactory;

    @Inject
    private Database database;
    
	public Result login(){
		Form<User> userForm = formFactory.form(User.class);

		return ok(login.render(userForm));
	}

	/**
	Calls the validUser function to check if there is a valid user for the entered username and password. 
	Returns a simple message based on whether or not the log in was successful.
	*/
	public Result loginPost() {
		Form<User> userForm = formFactory.form(User.class);
		User user = userForm.bindFromRequest().get();
		
		String message = "";
		try{
			if(!validUser(user)){
				message = "Error: invalid login. Please try again.";
			}
			else{	
				message = "Hello " + user.getUsername();
			}
		}
		catch(SQLException e){
			e.printStackTrace();
			message = "Caught SQLException";
		}
		
		System.out.println(message);
		return ok(message);
	}
	
	/**
	Returns true if there is a valid entry in the database for the given user.
	*/
	private boolean validUser(User user) throws SQLException{
		
		Connection con = database.getConnection();
		String query = "SELECT 1 FROM usernames WHERE username = ? AND pw = ?";
		
		PreparedStatement pstmt = con.prepareStatement(query);
			
		pstmt.setString(1, user.getUsername());
		pstmt.setString(2, user.getPassword());
		
		ResultSet rs = pstmt.executeQuery();
		
		return rs.next();
		
	}
}