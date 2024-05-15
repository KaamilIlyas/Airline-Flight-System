package project;

public class Admin extends User{

	/*Here inheritance is used as we use extends keyword to extend the functionality
	of the parent class i.e User to the sub class i.e Admin*/
	public Admin(String name, String gender, String age, String cnic, String username, String password) {
		super(name, gender, age, cnic, username, password);
	}
	
}
