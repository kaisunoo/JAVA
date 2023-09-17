//Scanner for user input
import java.util.Scanner;

public class ArithmeticSequenceFinder {
    public static void main(String[] args) {
        Scanner arithmetic = new Scanner(System.in);
        
        //Input 
        System.out.println("Enter the first 4 numbers of the arithmetic sequence:");
        int[] sequence = new int[4];
        for (int i = 0; i < 4; i++) {
            sequence[i] = arithmetic.nextInt();
        }
        
        //Common Difference (d = the difference of the sequence)
        int d = sequence[1] - sequence[0];
        
        //Process
        boolean isArithmeticSequence = true;
        for (int i = 1; i < 3; i++) {
            if (sequence[i + 1] - sequence[i] != d) {
                isArithmeticSequence = false;
            }
        }
        
        //Output
        if (!isArithmeticSequence) {
            System.out.println("The series is not an arithmetic sequence!");
        } else {
            System.out.println("The common difference of the arithmetic sequence is: " + d);
            System.out.println("Enter the series to: ");
            
            //nth = the num position in the series
            int nth = arithmetic.nextInt();
            
            //Num = number to identify
            int Num = sequence[0] + (nth - 1) * d;
            System.out.println("The " + nth + "(rd/th) number in the series is " + Num);
        }

        arithmetic.close();
    }
}
