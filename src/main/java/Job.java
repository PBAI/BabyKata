public class Job {


    private double startTime;


    public void setStartTime(double startTimeToSet) throws StartTimeTooEarlyException {
        if(startTimeToSet < 17.00) {
        throw new StartTimeTooEarlyException();
    }
        this.startTime = startTimeToSet;
    }


    public void setEndTime(double endTimeToSet) {
    }
}
