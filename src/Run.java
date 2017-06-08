import java.sql.Time;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class Run {

    private RunnerModel runner;
    private int max;
    private int min;
    private TimeConversion timeConversion = new TimeConversion();

    public Run(RunnerModel runner) {
        this.runner = runner; //lets us use the model from the main class in this class freely.
    }

    public void practiceRun(){
        System.out.println("You practiced running!");
        max = runner.getPersonalBestTime(); //sets max to the runners best possible time.
        min = runner.getPersonalWorstTime(); // sets min to the runners worst possible time.
        int randomNum = ThreadLocalRandom.current().nextInt(max + 1, min); //gets a random number between max and min.
        if(randomNum < Results.getLowestRun()){ // if it is lower that the previous lowest number, display a success message.

            System.out.println(timeConversion.timeConverter(randomNum) + " is your new personal best run time for this session! This time in seconds is " + randomNum); //converts the seconds to minute format using the time conversion class.
        }else{
            System.out.println(timeConversion.timeConverter(randomNum) + "This in seconds is " + randomNum); // uses a regular output for a record that is not a personal best.
        }

        Results.addRunRecord(randomNum); // adds this to the run array.
    }
}
