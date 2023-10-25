public class TwoDimensionalArrays extends Observer { // 3/3 observers.
    //private Subject subject;

    public TwoDimensionalArrays(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        multiplyAndDivide(subject.getTemperature());
    }

    public void multiplyAndDivide(double number) {
        double[][] numbers = {{1.0,2.0}, {3.0,4.0}, {5.0,6.0}, {7.0,8.0}, {9.0,10.0}};

        System.out.println("Two Dimensional Arrays:");

        for (double[] arr : numbers) {
            double product = 1.00;
            double quotient = 1.00;

            for (double num : arr) {
                if (num %2 != 0) { //multiply every odd number
                    product = num;
                } else { //divide every even number
                    quotient = num;
                }
            }

            System.out.printf("Product: %.2f\n", product * number);
            System.out.printf("Quotient: %.2f\n", number / quotient);
        }
    }
}
