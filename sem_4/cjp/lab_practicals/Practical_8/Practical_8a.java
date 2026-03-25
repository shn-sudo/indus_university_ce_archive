public class Practical_8a{
    public static void main(String[] args) {
        try {
            if (args.length < 2) {
                throw new IllegalArgumentException("Error: Please enter exactly TWO command line arguments.");
            }

            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);

            if (num2 == 0) {
                throw new ArithmeticException("Error: Division by Zero is not allowed!");
            }

            int result = num1 / num2;
            System.out.println("First Argument  : " + num1);
            System.out.println("Second Argument : " + num2);
            System.out.println("Result (" + num1 + " / " + num2 + ") = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Number Format Exception Caught: Arguments must be valid integers!");
        } catch (IllegalArgumentException e) {
            System.out.println("Argument Exception Caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught: " + e.getMessage());
        } finally {
            System.out.println("\n[Finally Block]: Program execution complete.");
        }
    }
}
