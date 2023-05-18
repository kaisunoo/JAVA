class EspañoAct2
{
public static void main(String[] args) 
	{
	    String name = "Kyla Caryl B. Españo", contact = "09123456789", educ = "Undergraduate";
	    int age = 22, minwage = 570; 
	    char gender = 'F';
	    double salary = 200.00;
	    
	    System.out.println("Employee Name:" +name);
	    System.out.println("Age:" +age);
	    System.out.println("Gender:" +gender);
	    System.out.println("Contact Number:" +contact);
	    System.out.println("Educational Attainment:" +educ);
	    System.out.println("Salary Earned:" +salary);
	    
	    boolean regular = true, COS = false;
	    if (minwage<salary) { 
	        System.out.println(regular);
	    }
	    else {
	        System.out.println(COS);
}
}
}
