class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class prac25 {
    
    public static void checkNumber(int num) throws InvalidNumberException {
        if (num != 1 && num != 4 && num != 7) {
            throw new InvalidNumberException("Invalid number: " + num + ". Allowed numbers are 1, 4, and 7.");
        } else {
            System.out.println("Valid number: " + num);
        }
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 4, 7, 9};
        
        for (int num : numbers) {
            
            try {
                checkNumber(num);
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
