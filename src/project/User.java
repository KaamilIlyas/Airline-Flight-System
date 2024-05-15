package project;

//here user class is created
public class User {
	
	//Following are the variables of user class
	protected String name;
	protected String gender;
	protected String age;
	protected String cnic;
	protected String username;
	protected String password;
	
	//Creating parameterized constructor of user class
	public User(String name, String gender, String age, String cnic, String username, String password) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.cnic = cnic;
		this.username = username;
		this.password = password;
	}
	
}
