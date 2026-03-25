class NoMatchException extends Exception {
    public NoMatchException(String message) {
        super(message);
    }
}

public class Practical_8b {
    static void checkString(String input) throws NoMatchException {
        if (!input.equals("India")) {
            throw new NoMatchException("NoMatchException: \"" + input + "\" is not equal to \"India\"");
        }
        System.out.println("Match found! The string is: " + input);
    }

    public static void main(String[] args) {
        String[] testInputs = {"India", "China", "India", "USA"};

        for (String s : testInputs) {
            try {
                checkString(s);
            } catch (NoMatchException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
