import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;

public class JobTest {

    @Test (expected = StartTimeTooEarlyException.class)
    public void shouldNotHaveStartTimeEarlierThanFivePM() throws Exception {
        Job testJob = new Job();
        int fourPM = 16;
        testJob.setStartTime(fourPM);
    }

    @Test (expected = EndTimeTooLateException.class)
    public void shouldNotHaveEndTimeAfterFourAM() throws Exception {
        Job testJob = new Job();
        int endTime = 29;
        testJob.setEndTime(endTime);
    }

    @Ignore
    @Test
    public void shouldCalculateMoneyOwedBasedOnFamilySetForJob() throws Exception {
        HashMap<List<Integer>, BigDecimal> familyRates = new HashMap<>();
        ArrayList<Integer> firstTimeRange = new ArrayList<>();
        firstTimeRange.add(17);
        firstTimeRange.add(22);
        BigDecimal fifteenDollarsPerHour = new BigDecimal("15.00");
        familyRates.put(firstTimeRange, fifteenDollarsPerHour);

        ArrayList<Integer> secondTimeRange = new ArrayList<>();
        secondTimeRange.add(23);
        secondTimeRange.add(28);
        BigDecimal twentyDollars = new BigDecimal("20.00");
        familyRates.put(secondTimeRange, twentyDollars);

        Family familyA = new Family(familyRates);

        Job testJob = new Job();
        testJob.setFamily(familyA);

        int sixPm = 18;
        testJob.setStartTime(sixPm);

        int oneAm = 25;
        testJob.setEndTime(oneAm);

        BigDecimal amount = testJob.calculateMoneyOwed();

        assertEquals(new BigDecimal("175.00"), amount);

    }
}