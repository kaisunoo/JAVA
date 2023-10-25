public class Fahrenheit extends Observer { // 1/3 observers.

    public Fahrenheit(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        convertToCelsius(subject.getTemperature());
    }

    public void convertToCelsius(double temperatureInCelsius) {
        double temperatureInFahrenheit = temperatureInCelsius * 9/5 + 32;
        System.out.println("Fahrenheit: " + temperatureInFahrenheit + " F");
        System.out.println();
    }
}