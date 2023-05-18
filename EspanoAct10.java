class Emlpoyee{
	private String name, idNum, address, conNum, educ, grade;
	private int age, hr, rate;
	private double gross; 
	private char gender;

	//Fix
	//double computeGross(){
	//	double gross = hr * rate;
	//	return gross;
	//}
	//Set Method
	public void setNa(String name){
		this.name = name;
	}
	public void setId(String idNum){
		this.idNum = idNum;
	}
	public void setAgee(int age){
		this.age = age;
	}
	public void setGen(char gender){
		this.gender = gender;
	}
	public void setAd(String address){
		this.address= address;
	}
	public void setCont(String conNum){
		this.conNum = conNum;
	}
	public void setEdu(String educ){
		this.educ = educ;
	}
	public void setHours(int hr){
		this.hr = hr;
	}
	public void setHourrate(int rate){
		this.rate = rate;
	}
	public void setGrr(String grade){
		this.grade = grade;
	}
	public void setGS(double gross){
		this.gross = gross;
	}
	//Get Method
	public String getNa(){
		return name;
	}
	public String getId(){
		return idNum;
	}
	public int getAgee(){
		return age;
	}
	public char getGen(){
		return gender;
	}
	public String getAd(){
		return address;
	}
	public String getCont(){
		return conNum;
	}
	public String getEdu(){
		return educ;
	}
	public int getHours(){
		return hr;
	}
	public int getHourrate(){
		return rate;
	}
	public String getGrr(){
		return grade;
	}
	public double getGS(){
		return gross;
	}
	
}

class EspanoAct10{
	public static void main(String[] args) {
		Emlpoyee ky = new Emlpoyee();
		ky.setNa("Kyla Caryl B. Espano");
		ky.setId("Exo-l 1485");
		ky.setAgee(22);
		ky.setGen('F');
		ky.setAd("Baao, Camarines Sur");
		ky.setCont("0983527392");
		ky.setEdu("Undergraduate");
		ky.setHours(40);
		ky.setHourrate(250);
		ky.setGS(10000);
		ky.setGrr("SG1");
		System.out.println("Employee name:" + ky.getNa());
		System.out.println("Employee Id number:" + ky.getId());
		System.out.println("Age:" + ky.getAgee());
		System.out.println("Gender:" + ky.getGen());
		System.out.println("Address:" + ky.getAd());
		System.out.println("Contact number:" + ky.getCont());
		System.out.println("Educational attaintment:" + ky.getEdu());
		System.out.println("No. of hours worked:" + ky.getHours());
		System.out.println("Hourly rate:" + ky.getHourrate());
		System.out.println("Gross Salary:" + ky.getGS());
		System.out.println("Employee Salary Grade is " + ky.getGrr());
	}
	
}

		