/**
 * Created by christiancampbell on 6/5/17.
 */
public class RunnerModel {
    private int personalBestTime;
    private int personalWorstTime;
    private int personalBestJump;
    private int personalWorstJump;

    public RunnerModel(int personalBestTime, int personalWorstTime, int personalBestJump, int personalWorstJump) { //this is the object contructor that is used to build out the runner's data.
        this.personalBestTime = personalBestTime;
        this.personalWorstTime = personalWorstTime;
        this.personalBestJump = personalBestJump;
        this.personalWorstJump = personalWorstJump;
    }

    public int getPersonalBestTime() {
        return personalBestTime;
    } //these can be generated to easily get the properties of the runner

    public void setPersonalBestTime(int personalBestTime) {
        this.personalBestTime = personalBestTime;
    } // it is good practice to generate all of your getters and setters even if you do not use them.

    public int getPersonalWorstTime() {
        return personalWorstTime;
    }

    public void setPersonalWorstTime(int personalWorstTime) {
        this.personalWorstTime = personalWorstTime;
    }

    public int getPersonalBestJump() {
        return personalBestJump;
    }

    public void setPersonalBestJump(int personalBestJump) {
        this.personalBestJump = personalBestJump;
    }

    public int getPersonalWorstJump() {
        return personalWorstJump;
    }

    public void setPersonalWorstJump(int personalWorstJump) {
        this.personalWorstJump = personalWorstJump;
    }
}
