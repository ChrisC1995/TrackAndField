import java.sql.Time;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class Run {

    RunnerModel runner;
    int max;
    int min;
    private TimeConversion timeConversion = new TimeConversion();

    public Run(RunnerModel runner) {
        this.runner = runner;
    }

    public void practiceRun(){
        System.out.println("Run");
        max = runner.getPersonalBestTime();
        min = runner.getPersonalWorstTime();
        int randomNum = ThreadLocalRandom.current().nextInt(max + 1, min);
        if(randomNum < Results.getLowestRun()){

            System.out.println(timeConversion.timeConverter(randomNum) + " is your new personal best run time. This time in seconds is " + randomNum);
        }else{
            System.out.println(timeConversion.timeConverter(randomNum) + "This in seconds is " + randomNum);
        }

        Results.addRunRecord(randomNum);
    }
}
