import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class Jump {

    RunnerModel runner;
    int max;
    int min;
    private LengthConversion lengthConversion = new LengthConversion();

    public Jump(RunnerModel runner) {
        this.runner = runner;
    }

    public void practiceJump(){
        System.out.println("Jump");
        max = runner.getPersonalBestJump();
        min = runner.getPersonalWorstJump();
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        if(randomNum > Results.getHighestJump()){

            System.out.println(lengthConversion.lengthConverter(randomNum) + " is your new personal best" + ". This in inches is " + randomNum);
        }else{
            System.out.println(lengthConversion.lengthConverter(randomNum) + " this in inches is " + randomNum);
        }
        Results.addJumpRecord(randomNum);

    }
}
