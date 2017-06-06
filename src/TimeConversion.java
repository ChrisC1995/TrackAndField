/**
 * Created by christiancampbell on 6/6/17.
 */
public class TimeConversion {

    private int secondsToMinutes;
    private int remainingSeconds;

    public String timeConverter(int seconds){ //converts seconds to minutes.
            secondsToMinutes = seconds / 60; //gets the hours
            remainingSeconds = seconds % 60; // gets the seconds.

            return secondsToMinutes + " Minutes " + remainingSeconds + " Seconds "; //displays the results.

    }
}
