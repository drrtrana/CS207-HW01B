import java.time.LocalTime;

public class Time
{
    private final int hour;
    private final int min;
    private int sec;
    private char meridiem;

    public Time()
    {
        this.hour = 12;
        this.min = 0;
        this.sec = 0;
        this.meridiem = 'A';
    }

    public Time(int hour, int min, int sec, char meridiem)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.meridiem = meridiem;
    }

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }

    public char getMeridiem() {
        return meridiem;
    }

    public int getTotalMinutes()
    {
        int totalMinutes = 0;

        if(this.hour == 12 && meridiem == 'A')
        {
            totalMinutes = this.min;
        }

        else if(meridiem == 'A')
        {
            totalMinutes = (this.hour * 60) + this.min;
        }

        else if(this.hour == 12 && meridiem == 'P')
        {
            totalMinutes = (this.hour * 60) + this.min;
        }

        else if(meridiem == 'P')
        {
            totalMinutes = (12 * 60) + (this.hour * 60) + this.min;
        }

        return totalMinutes;
    }

    public int getTotalSeconds()
    {
        return (this.getTotalMinutes() * 60) + this.sec;
    }

    public static Time localTimeToTimeObject(LocalTime localTime) {
        int hour;
        char meridiem;
        if(localTime.getHour() > 12) {
            hour = localTime.getHour() - 12;
            meridiem = 'P';
        }
        else{
            hour = localTime.getHour();
            meridiem = 'A';
        }
        return new Time(hour, localTime.getMinute(), localTime.getSecond(), meridiem);
    }

    public static Time[] getMultipleTimes(LocalTime[] localTimes) {
        Time[] timeArray = new Time[localTimes.length];
        for (int i = 0; i < timeArray.length; i++) {
            timeArray[i] = localTimeToTimeObject(localTimes[i]);
        }
        return timeArray;
    }
}