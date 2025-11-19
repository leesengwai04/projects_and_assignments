
public class Organizer extends User{
	private String companyRegisNum;
	
	public Organizer() {
		super();
	}
	
	public Organizer(String name,int age, String gender,String email,String contactNum,String password,String companyRegisNum) {
		super(name,age,gender,email,contactNum,password);
		this.companyRegisNum = companyRegisNum;
	}
	
	public void setCompanyRegisNum(String companyRegisNum) {
		this.companyRegisNum = companyRegisNum;
	}
	
	public String getCompanyRegisNum() {
		return companyRegisNum;
	}
	
	public void addEvent() {
		
	}
	@Override
	public String toString() {
		return String.format("Organizer Name:%s\nCompany Registration Number:%s\nEmail:%s\nContact Number:%s",
				super.getName(),companyRegisNum,super.getEmail(),super.getContactNum());
	}
}
