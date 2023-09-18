import java.util.Scanner;
import java.util.Stack;

public class ProgrammingExercise3 {
    public static void main(String[] args) {
        System.out.println("\n****** PROGRAMMING EXERCISE 3 ******");
        Scanner scan = new Scanner(System.in);
        boolean tryAgain = true;
        
        while (tryAgain) {
            System.out.print("\nEnter a String: ");
            String input = scan.nextLine();
            
            Stack<Character> stack = new Stack<>();
            
            // Push all characters of the string to the stack
            for (char c : input.toCharArray()) {
                stack.push(c);
            }
            
            System.out.print("\nCharacters Pushed in Stack: ");
            
            for (char c : stack) {
                System.out.print(c + " ");
            }
            
            String reversedString = reverseString(input);
            
            System.out.print("\n\nReversed String: " + reversedString +"\n");
            
            System.out.print("\nTry Again? (yes/no): ");
            String answer = scan.nextLine();
            tryAgain = answer.equalsIgnoreCase("yes");
        }
        
        System.out.println("\n****** Program Stopped ******\n");
    }
    
    public static String reverseString(String input) {
        Stack<Character> stack = new Stack<>();
        StringBuilder reversed = new StringBuilder();
        
        // Push all characters of the string to the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        
        // Pop all characters from the stack and put them back to string
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        return reversed.toString();
    }
}
