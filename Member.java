import java.util.ArrayList;


public class Member extends User{
	
	
	
	public Member() {
		super();
	}

	public Member(String name, int age, String gender, String email,String contactNum,String password) {
		super(name,age,gender,email,contactNum,password);
	}
	


	


	@Override
	public String toString() {
		return String.format("Name:%s\nAge:%s\nEmail:%s\nContact Number:%s\n",super.getName(),super.getAge(),super.getEmail(),super.getContactNum());
	}
	
	
	
	

	

}
