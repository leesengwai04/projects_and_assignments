import java.util.*;
import java.io.*;

public class User {
	private String name;
	private int age;
	private String gender;
	private String email;
	private String contactNum;
	private String password;
	private String newName;
	private int newAge;
	private String newEmail;
	private String newContactNum;
	private String newPassword;
	Scanner input = new Scanner(System.in);
	
	public User() {
		
	}
	
	public User(String name, int age, String gender, String email, String contactNum, String password) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.contactNum = contactNum;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNum() {
		return contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setNewName(String n) {
		n = newName;
		System.out.println("Enter username");
		n = input.nextLine();
	}
	public void setNewAge(int a) {
		a = newAge;
		System.out.println("Enter age");
		while(true) {
		try {
			a = input.nextInt();
			break;
		}
		catch(InputMismatchException e) {
			System.out.println("Enter correct age");
			}
		}
	}
	
	public void setNewEmail(String e){
		e = newEmail;
		System.out.println("Enter email:");
		while(true) {
			e = input.nextLine();
			if (e.contains("@")) {
				break;
			}
			else {
				System.out.println("Enter correct email");
			}
			
		}
	}
	public void setNewContactNum(String c){
		c = newContactNum;
		System.out.print("Enter contact number:");
		c = input.nextLine();
	}
	public void setNewPassword(String p) {
		p = newPassword;
		System.out.print("Enter password:");
		p = input.nextLine();
	}

	
	public String getNewName() {
		return newName;
	}

	public int getNewAge() {
		return newAge;
	}

	public String getNewEmail() {
		return newEmail;
	}

	public String getNewContactNum() {
		return newContactNum;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public String toString() {
		return String.format("User [name=%s, age=%s, gender=%s, email=%s, contactNum=%s, password=%s]", name, age,
				gender, email, contactNum, password);
	}
	
	
	
	

}
