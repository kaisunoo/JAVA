public class Fibonacci extends Observer { // 2/3 observers.

    public Fibonacci(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        generateFibonacciSequence((int)subject.getTemperature());
    }

    public void generateFibonacciSequence(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.print("Fibonacci Sequence: " + firstTerm + " " + secondTerm);

        for (int i = 2; i < n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println();
        System.out.println();
    }
}
