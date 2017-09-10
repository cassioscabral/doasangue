package controllers;

public class UsersController {
	
//	@route(value = "/users/{username}", method = "GET")
	public String show(String username) {
		// encontra usuario pelo username
		return "user  page";
	}

}
