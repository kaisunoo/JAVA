class GradeCalculatorSingleton {
    // Private static instance of the Singleton class.
    private static GradeCalculatorSingleton instance = null;
    
    // Private constructor to prevent external instantiation.
    private GradeCalculatorSingleton() {
        // Private constructor to ensure Singleton pattern.
        }
        // Public method to access the Singleton instance.
        public static GradeCalculatorSingleton getInstance() {
            if (instance == null) {
                instance = new GradeCalculatorSingleton();
            }
            return instance;
            }
            // Calculate the average of four grades.
            public double calculateAverage(double prelimGrade, double midtermGrade, double prefinalGrade, double finalGrade) {
                double sum = prelimGrade + midtermGrade + prefinalGrade + finalGrade;
                return sum / 4.0;
                }
                public static void main(String[] args) {
                    // Get an instance of the GradeCalculatorSingleton.
                    GradeCalculatorSingleton calculator = GradeCalculatorSingleton.getInstance();
                    double prelimGrade = 90.0;
                    double midtermGrade = 87.0;
                    double prefinalGrade = 92.0;
                    double finalGrade = 91.0;
                    // Calculate the average.
                    double average = calculator.calculateAverage(prelimGrade, midtermGrade, prefinalGrade, finalGrade);
                    // Print the average grade.
                    System.out.println("Your Average Grade is: " + average);
                    }}
