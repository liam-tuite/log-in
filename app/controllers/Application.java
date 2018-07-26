package controllers;

import play.mvc.*;
import views.html.*;

public class Application extends Controller {

	public Result login(){
		//TODO Verify user login and direct to next page if successful
		return ok(login.render());
	}
}