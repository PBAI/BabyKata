public class EndTimeTooLateException extends Exception {

    private String message = "End time must be no later than 4am!";

    public String getMessage() {
        return this.message;
    }
}
