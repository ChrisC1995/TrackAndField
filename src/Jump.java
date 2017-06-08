import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class Jump {

    private RunnerModel runner;
    private int max;
    private int min;
    private LengthConversion lengthConversion = new LengthConversion();

    public Jump(RunnerModel runner) {
        this.runner = runner; // lets us use the runner object freely in this class.
    }

    public void practiceJump(){
        System.out.println("You practiced jumping!");
        max = runner.getPersonalBestJump(); //sets max to the best possible jumping distance.
        min = runner.getPersonalWorstJump(); // sets min to the worst possible jumping distance.
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1); // generates a random number between min an max.
        if(randomNum > Results.getHighestJump()){ //if the random is greater than the previous highest in the arraylist, display a success message.

            System.out.println(lengthConversion.lengthConverter(randomNum) + " is your new personal best for this session!" + " This in inches is " + randomNum); //converter is used the results to feet.
        }else{
            System.out.println(lengthConversion.lengthConverter(randomNum) + " this in inches is " + randomNum); // same as above but without the success message.
        }
        Results.addJumpRecord(randomNum); // adds this record to the jump array. 

    }
}
