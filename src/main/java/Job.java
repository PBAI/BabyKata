import java.math.BigDecimal;

public class Job {

    private double startTime;
    private double endTime;
    private Family family;

    public void setStartTime(int startTimeToSet) throws StartTimeTooEarlyException {
        int earliestStartTime = 17;
        if(startTimeToSet < earliestStartTime) {
        throw new StartTimeTooEarlyException();
    }
        this.startTime = startTimeToSet;
    }

    public void setEndTime(int endTimeToSet) throws EndTimeTooLateException {
        int latestEndTime = 28;
        if(endTimeToSet > latestEndTime){
            throw new EndTimeTooLateException();
        }
        this.endTime = endTimeToSet;
    }

    public void setFamily(Family familyToSet) {
        this.family = familyToSet;
    }

    public BigDecimal calculateMoneyOwed() {
        return new BigDecimal("0.00");
    }
}
