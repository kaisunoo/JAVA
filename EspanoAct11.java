class Calculator{
	int a = 30;
	int b = 3;
	int sum = a + b;
	int dif = a - b;
	int prod = a * b;
	int quo = a / b;

	public void print(){
		System.out.println("Calculator performs arithmetic operations!");
	}
	public void addN(){
		System.out.println("Sum: "+sum);
	}
	public void subtract(){
		System.out.println("Difference: "+dif);
	}
	public void product(){
		System.out.println("Product: "+prod);
	}
	public void quotient(){
		System.out.println("Quotient: "+quo);
	}
}

public class Scie_cal extends Calculator{
	public void printSub(){
		super.print();
		System.out.println("Scientific calculator is used for advance or complicated math problems");
	}
	public void subN(){
		super.subtract();
	}
	public void prodN(){
		super.product();
	}
	public  void quotientN(){
		super.quotient();
	}

	public static void main(String[] args) {
	Scie_cal ky = new Scie_cal();

	ky.printSub();
	ky.addN();
	ky.subN();
	ky.prodN();
	ky.quotientN();
	}
}