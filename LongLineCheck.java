public class LongLineCheck implements Check{

    //Behavior:
    //   -This method checks if the input line has over 100 characters or not, if yes it will
    //   -create an error with error code 1, the line number that has the error, and the
    //   -message that the line is long.
    //Parameters:
    //   -String line: the input line to check for error.
    //   -int lineNumber: the number of the line being check.
    //Return: 
    //   -return the newly created error if line is long. The method will not return an error
    //   -if the line is 100 or under for length.
    public Optional<Error> lint(String line, int lineNumber) {
        if (line.length() > 100) {
            return Optional.of(new Error(1, lineNumber, "Line has long line"));
        }
        return Optional.empty();
    }

}