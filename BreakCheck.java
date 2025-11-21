
public class BreakCheck implements Check{

    //Behavior:
    //   -This method checks if the input line has the keyword break, it will
    //   -create an error object with error code 2, the line number that has the error, and the
    //   -message that the line contain break. If the word break is from a comment 
    //   -line not a code line, the line won't be flag.
    //Parameters:
    //   -String line: the input line to check for error.
    //   -int lineNumber: the number of the line being check.
    //Return: 
    //   -return the newly created error if line contain the keyword break.
    //   -And the method will not return an error if the line has no break
    //   -or break is in a comment
    public Optional<Error> lint(String line, int lineNumber) {
        if (line.contains("break")) {
            if (line.contains("//")) {
                if (line.indexOf("//") > line.indexOf("break")) {
                    return Optional.of(new Error(2, lineNumber, "break"));
                }
            } else {
                return Optional.of(new Error(2, lineNumber, "break"));
            }
        }
        return Optional.empty();
    }
}