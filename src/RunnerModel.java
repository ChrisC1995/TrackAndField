/**
 * Created by christiancampbell on 6/5/17.
 */
public class RunnerModel {
    int personalBestTime;
    int personalWorstTime;
    int personalBestJump;
    int personalWorstJump;

    public RunnerModel(int personalBestTime, int personalWorstTime, int personalBestJump, int personalWorstJump) {
        this.personalBestTime = personalBestTime;
        this.personalWorstTime = personalWorstTime;
        this.personalBestJump = personalBestJump;
        this.personalWorstJump = personalWorstJump;
    }

    public int getPersonalBestTime() {
        return personalBestTime;
    }

    public void setPersonalBestTime(int personalBestTime) {
        this.personalBestTime = personalBestTime;
    }

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
