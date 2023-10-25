public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new Fahrenheit(subject); 
        new Fibonacci(subject);
        new TwoDimensionalArrays(subject);

        double input = 11.00;
        subject.setTemperature(input);
    }
}
