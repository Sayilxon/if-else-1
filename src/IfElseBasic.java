public class IfElseBasic {
    public static void main(String[] args) {
        System.out.println("=== If-Else Demo ===\n");

        // Basic if-else
        int temperature = 28;
        if (temperature > 30) {
            System.out.println("It's hot! Stay hydrated.");
        } else if (temperature >= 20) {
            System.out.println("Pleasant weather. Enjoy your day!");
        } else if (temperature >= 10) {
            System.out.println("Chilly. Grab a jacket.");
        } else {
            System.out.println("Freezing! Stay warm.");
        }

        // Grade calculator
        System.out.println("\n=== Grade Calculator ===");
        int[] scores = {95, 82, 73, 61, 45};
        for (int score : scores) {
            String grade;
            String feedback;
            if (score >= 90) {
                grade    = "A";
                feedback = "Excellent!";
            } else if (score >= 80) {
                grade    = "B";
                feedback = "Good job!";
            } else if (score >= 70) {
                grade    = "C";
                feedback = "Satisfactory";
            } else if (score >= 60) {
                grade    = "D";
                feedback = "Needs improvement";
            } else {
                grade    = "F";
                feedback = "Failed";
            }
            System.out.printf("Score: %3d | Grade: %s | %s%n", score, grade, feedback);
        }

        // FizzBuzz — classic programming challenge
        System.out.println("\n=== FizzBuzz (1-20) ===");
        for (int i = 1; i <= 20; i++) {
            if (i % 15 == 0)      System.out.print("FizzBuzz ");
            else if (i % 3 == 0)  System.out.print("Fizz ");
            else if (i % 5 == 0)  System.out.print("Buzz ");
            else                  System.out.print(i + " ");
        }
        System.out.println();
    }
}
