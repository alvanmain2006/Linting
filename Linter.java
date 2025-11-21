import java.util.*;
import java.io.*;

public class Linter {
    // TODO: Your code here
    private List<Check> checks;

    //Behavior:
    //   -This method construct linter object, with all the checks to check for error,
    //Parameters:
    //   -List<Check> checks: the list of all the checks that will be use to check for error
    //   -in the input code.
    public Linter(List<Check> checks) {
        this.checks = new ArrayList<>(checks);
    }

    //Behavior:
    //   -This method will go through the input code file, and on each line of the file, it will
    //   -use all checks to see if there is any error in the line. If any Errors
    //   -found they will be added to an error list
    //Parameters:
    //   -String fileName: the name of the file that will be checked.
    //Return: 
    //   -returning a list of errors found
    public List<Error> lint(String fileName) throws FileNotFoundException{
        List<Error> errors = new ArrayList<>();
        Optional<Error> error;
        Scanner fileScan = new Scanner(new File(fileName));
        int lineNum = 0;
        while (fileScan.hasNextLine()) {
            String line = fileScan.nextLine();
            lineNum += 1;
            for (Check check : checks) {
                Optional.of(error = check.lint(line, lineNum));
                if (error.isPresent()) {
                    errors.add(error.get());
                }
            }
        }
        return errors;
    }
    
}