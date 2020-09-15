import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {

    @Ignore
    @Test (expected = StartTimeTooEarlyException.class)
    public void shouldNotHaveStartTimeEarlierThanFivePM(){
        Job testJob = new Job();

        double fourThirtyPmInTwentyFourHourClock = 16.30;
        testJob.setStartTime(fourThirtyPmInTwentyFourHourClock);
    }

}