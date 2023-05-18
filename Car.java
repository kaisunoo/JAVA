/*KYLA CARYL B. ESPANO
According to the instruction given on number 1, the class that should be used is "Car Class". 
The reason why I can't name this java file instructed on number 2 because I only used one file 
for both the Class and Object initialization that I've assigned.*/

public class Car{
	String brand = "Chevrolet", model = "C6 ZR-1 Corvette", color = "Red", seat = "4 Person";
	double price = 86370.00;

	void start(){
		System.out.println("vroommmmmm... vroom... vroom... vroommmmmmmmmmmmmm...");
	}
	void navigate(){
		System.out.println("Location: To Naga City. Navigation: Turn left, in thirty minutes turn right, turn left. \nFinally, we arivved at the dstination!");
	}

	public static void main(String[] args) {
		Car lightningMcQueen = new Car();

		System.out.println("The brand of the Car is: " + lightningMcQueen.brand);
		System.out.println("The model of the Car is: " + lightningMcQueen.model);
		System.out.println("The color of the Car is: " + lightningMcQueen.color);
		System.out.println("The seating capacity of the Car is good for: " + lightningMcQueen.seat);
		System.out.println("The price of the Car is: " + lightningMcQueen.price);
		System.out.println("\nMethod 1");
		lightningMcQueen.start();
		System.out.println("\nMethod 2");
		lightningMcQueen.navigate();
	}
}