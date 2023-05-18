import java.util.Scanner;
class Employee {
	private String name, idNum, address, conNum, educ;
	private int age, grossSal;
	private char gender;

	public void setEname(String name){
		this.name = "Kyla Caryl B. Espano";
	}



	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

		System.out.println("Enter hours of work: "); 
		String hr = input.next();
		System.out.println("Enter rate per hour of work: ");
		String rate = input.next();
		System.out.println("=============================");
	}
}