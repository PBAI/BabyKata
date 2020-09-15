public class Job {

    private double startTime;
    private double endTime;

    public void setStartTime(double startTimeToSet) throws StartTimeTooEarlyException {
        double earliestStartTime = 17.00;
        if(startTimeToSet < earliestStartTime) {
        throw new StartTimeTooEarlyException();
    }
        this.startTime = startTimeToSet;
    }


    public void setEndTime(double endTimeToSet) throws EndTimeTooLateException {
        double latestEndTime = 4.00;
        if(endTimeToSet > latestEndTime){
            throw new EndTimeTooLateException();
        }
        this.endTime = endTimeToSet;
    }
}
