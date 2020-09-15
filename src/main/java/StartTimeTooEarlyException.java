public class StartTimeTooEarlyException extends Exception{

    private String message = "Start time must be no earlier than 5pm!";

    public String getMessage(){
        return this.message;
    }
}
