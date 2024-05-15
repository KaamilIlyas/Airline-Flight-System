package project;

public class Passenger extends User{

	/*Here inheritance is used as we use extends keyword to extend the functionality
	of the parent class i.e User to the sub class i.e Passenger*/
	public Passenger(String name, String gender, String age, String cnic, String username, String password) {
		super(name, gender, age, cnic, username, password);

	}

}
