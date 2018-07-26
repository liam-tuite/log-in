package controllers;

import play.mvc.*;
import views.html.*;
import play.data.*;
import model.*;

import javax.inject.Inject;

public class Application extends Controller {

	@Inject
    private play.data.FormFactory formFactory;

	public Result login(){
		//TODO Verify user login and direct to next page if successful
		Form<User> userForm = formFactory.form(User.class);

		return ok(login.render(userForm));
	}

	public Result loginPost() {
		Form<User> userForm = formFactory.form(User.class);
		User user = userForm.bindFromRequest().get();
		System.out.println("Hello " + user.getUsername());
        return ok("Hello " + user.getUsername());
	}
}