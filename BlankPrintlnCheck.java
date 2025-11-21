import java.util.*;

// TODO: Your Code Here
public class BlankPrintlnCheck implements Check{
    
    //Behavior:
    //   -This method checks if the input line has a print statement that print blank line
    //   -or not, if yes it will create an error with error code 3, the line number 
    //   -that has the error, and the message that the line has blank print statement.
    //Parameters:
    //   -String line: the input line to check for error.
    //   -int lineNumber: the number of the line being check.
    //Return: 
    //   -return the newly created error if line has blank printing. 
    //   -The method will not return an error if there is no blank print statement.
    public Optional<Error> lint(String line, int lineNumber) {
        String blankPrint = "System.out.println(\"\")";
        if (line.contains(blankPrint)) {
            return Optional.of(new Error(3, lineNumber, "Line has Blank println"));
        }
        return Optional.empty();
    }
}