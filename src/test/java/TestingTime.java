import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(MockitoExtension.class)
public class TestingTime {
    @Test
    void getTotalMinutesShouldReturnTrueForA1Time() {
        /*Time time = new Time(3, 5, 12, 'A');
        assertEquals(185, time.getTotalMinutes());*/
    }

    @Test
    void getTotalMinutesShouldReturnTrueForP1Time() {
        /*Time time = new Time(3, 5, 12, 'P');
        assertEquals(905, time.getTotalMinutes());*/
    }

    @Test
    void getTotalMinutesShouldReturnTrueForA2Time() {
        /*Time time = new Time(12, 45, 12, 'A');
        assertEquals(45, time.getTotalMinutes());*/
    }

    @Test
    void getTotalMinutesShouldReturnTrueForP2Time() {
        /*Time time = new Time(12, 32, 12, 'P');
        assertEquals(752, time.getTotalMinutes());*/
    }

    @Test
    void getTotalSecondsShouldReturnTrueForA1Time() {
        /*Time time = new Time(3, 5, 12, 'A');
        assertEquals(11112, time.getTotalSeconds());*/
    }

    @Test
    void getTotalSecondsShouldReturnTrueForP1Time() {
        /*Time time = new Time(3, 5, 12, 'P');
        assertEquals(54312, time.getTotalSeconds());*/
    }

    @Test
    void getTotalSecondsShouldReturnTrueForA2Time() {
        /*Time time = new Time(12, 45, 12, 'A');
        assertEquals(2712, time.getTotalSeconds());*/
    }

    @Test
    void getTotalSecondsShouldReturnTrueForP2Time() {
        /*Time time = new Time(12, 32, 12, 'P');
        assertEquals(45132, time.getTotalSeconds());*/
    }

    @Test
    void localTimeToTimeObjectShouldReturnTimeObject() {
        /*LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour() > 12 ? localTime.getHour() - 12 : localTime.getHour();
        char meridiem = localTime.getHour() > 12 ? 'P' : 'A';
        Time testTime= Time.localTimeToTimeObject(localTime);
        assertTrue(hour == testTime.getHour()
                    && localTime.getMinute() == testTime.getMin()
                    && localTime.getSecond() == testTime.getSec()
                    && meridiem == testTime.getMeridiem());*/
    }

    @Test
    void getMultipleTimesShouldReturnTimeArray() {
        /*LocalTime[] localTimeArray = {LocalTime.now(), LocalTime.MIDNIGHT, LocalTime.NOON, LocalTime.MAX};
        Time[] timeArray = Time.getMultipleTimes(localTimeArray);
        boolean convertedCorrectly = true;
        int i = 0;
        while(i < localTimeArray.length && convertedCorrectly) {
            LocalTime localTime = localTimeArray[i];
            int hour = localTime.getHour() > 12 ? localTime.getHour() - 12 : localTime.getHour();
            char meridiem = localTime.getHour() > 12 ? 'P' : 'A';
            Time testTime = timeArray[i];
            convertedCorrectly = hour == testTime.getHour()
                    && localTime.getMinute() == testTime.getMin()
                    && localTime.getSecond() == testTime.getSec()
                    && meridiem == testTime.getMeridiem();
            assertTrue(convertedCorrectly);
            i++;
        }*/
    }

}
