
    private int code;
    private int lineNumber;
    private String message;

    //Behavior:
    //   -This method construct the error object, with the Error's information.
    //Parameters:
    //   -int code: the error code of a specific error.
    //   -int lineNumber: the line number of where the error occured
    //   -String message: the message to inform a specific error.
    public Error(int code, int lineNumber, String message) {
        this.code = code;
        this.lineNumber = lineNumber;
        this.message = message;
    }

    //Behavior:
    //   -This method turn the error into a String representation of the error, with it's
    //   -line number, error code, and the specifc message.
    //Return:
    //   -Return the String representation of the error.
    public String toString() {
        return "(Line: " + this.lineNumber + ") has error code " +  
                this.code + "\n" + this.message;
    }

    //Behavior:
    //   -This method get the specific line number of the Error.
    //Return:
    //   -Return line number of the error.
    public int getLineNumber() {
        return this.lineNumber;
    }

    //Behavior:
    //   -This method get the specific error code of the Error.
    //Return:
    //   -Return error code of the error.
    public int getCode() {
        return this.code;
    }

    //Behavior:
    //   -This method get the specific message of the error.
    //Return:
    //   -Return message of the error.
    public String getMessage() {
        return this.message;
    }
}