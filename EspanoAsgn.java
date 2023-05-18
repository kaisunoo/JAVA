//For user input
import java.util.Scanner; 

class Employee {
	//Employee class' attributes
	private String name, idNum, address, conNum, educ, grade;
	private int age;
	private char gender;

	//Set method to assign values
	public void setEname(String name){
		this.name = name;
	}
	public void setIdnum(String idNum){
		this.idNum = idNum;
	}
	public void setAdd(String address){
		this.address = address;
	}
	public void setConnum(String conNum){
		this.conNum = conNum;
	}
	public void setEduc(String educ){
		this.educ = educ;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public void setGrade(String grade){
		this.grade = grade;
	}

	//Get method to access values
	public String getEname(){
		return name;
	}
	public String getIdnum(){
		return idNum;
	}
	public String getAdd(){
		return address;
	}
	public String getConnum(){
		return conNum;
	}
	public String getEduc(){
		return educ;
	}
	public int getAge(){
		return age;
	}
	public char getGender(){
		return gender;
	}
	public String getGrade(){
	return grade;
	}
}

public class EspanoAsgn{
	public static void main(String[] args) {
		//User Input
		Scanner input = new Scanner (System.in);
		int hr, rate, gross;
		System.out.print("Enter hours of work: "); 
		hr = input.nextInt();
		System.out.print("Enter rate per hour of work: ");
		rate = input.nextInt();
		gross = hr * rate;
		System.out.println("=============================");
		
		//Assign values
		Employee ky = new Employee();
		ky.setEname("Kyla Caryl B. Españo");
		ky.setIdnum("EXO-L 1485");
		ky.setAge(22);
		ky.setGender('F');
		ky.setAdd("Baao, Camarines Sur");
		if (gross < 12034) {
			ky.setGrade("SG1");
		} else if (gross < 12790) {
			ky.setGrade("SG2");
		} else if (gross < 13572) {
			ky.setGrade("SG3");
		} else if (gross < 14400) {
			ky.setGrade("SG4");
		} else if (gross < 15275) {
			ky.setGrade("SG5");
		} else if (gross < 16200) {
			ky.setGrade("SG6");
		} else if (gross < 17179) {
			ky.setGrade("SG7");
		} else if (gross < 18251) {
			ky.setGrade("SG8");
		} else if (gross < 19593) {
			ky.setGrade("SG9");
		} else if (gross < 21205) {
			ky.setGrade("SG10");
		} else if (gross < 23877) {
			ky.setGrade("SG11");
		} else if (gross < 26052) {
			ky.setGrade("SG12");
		} else if (gross < 28276) {
			ky.setGrade("SG13");
		} else if (gross < 30799) {
			ky.setGrade("SG14");
		} else if (gross < 33575) {
			ky.setGrade("SG15");
		} else if (gross < 36628) {
			ky.setGrade("SG16");
		} else if (gross < 39986) {
			ky.setGrade("SG17");
		} else if (gross < 43681) {
			ky.setGrade("SG18");
		} else if (gross < 48313) {
			ky.setGrade("SG19");
		} else if (gross < 54251) {
			ky.setGrade("SG20");
		} else if (gross < 60901) {
			ky.setGrade("SG21");
		} else if (gross < 68415) {
			ky.setGrade("SG22");
		} else if (gross < 76907) {
			ky.setGrade("SG23");
		} else if (gross < 86742) {
			ky.setGrade("SG24");
		} else if (gross < 98886) {
			ky.setGrade("SG25");
		} else if (gross < 111742) {
			ky.setGrade("SG26");
		} else if (gross < 126267) {
			ky.setGrade("SG27");
		} else if (gross < 142683) {
			ky.setGrade("SG28");
		} else if (gross < 161231) {
			ky.setGrade("SG29");
		} else if (gross < 182191) {
			ky.setGrade("SG30");
		} else if (gross < 268121) {
			ky.setGrade("SG31");
		} else if (gross < 319660) {
			ky.setGrade("SG32");
		} else {
			ky.setGrade("SG33");
		}
		//Output
		System.out.println("Employee name: " + ky.getEname());
		System.out.println("Employee id number: " + ky.getIdnum());
		System.out.println("Age: " + ky.getAge());
		System.out.println("Gender: " + ky.getGender());
		System.out.println("Address: " + ky.getAdd());
		System.out.println("No. of hours worked: " + hr);
		System.out.println("Rate per hour of work: " + rate);
		System.out.println("Employee Gross Salary: " + gross);
		System.out.println("Employee Salary Grade is: " + ky.getGrade());
	}
}