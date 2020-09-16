import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {


    @Test (expected = StartTimeTooEarlyException.class)
    public void shouldNotHaveStartTimeEarlierThanFivePM() throws Exception {
        Job testJob = new Job();
        double fourThirtyPmInTwentyFourHourClock = 16.30;
        testJob.setStartTime(fourThirtyPmInTwentyFourHourClock);
    }

    @Test (expected = EndTimeTooLateException.class)
    public void shouldNotHaveEndTimeAfterFourAM() throws Exception {
        Job testJob = new Job();
        double endTime = 5.00;
        testJob.setEndTime(endTime);
    }

    @Ignore
    @Test
    public void shouldCalculateMoneyOwedBasedOnFamily() throws Exception {
        Job testJob = new Job();
        Family familyA = new Family();
        testJob.setFamily(familyA);

        double sixPm = 18.00;
        testJob.setStartTime(sixPm);

        double oneAm = 1.00;
        testJob.setEndTime(oneAm);



    }
}