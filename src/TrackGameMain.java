import java.util.Scanner;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class TrackGameMain {
    public static void main (String[] args){
        menu();
    }

    private static void menu() {
        Boolean loopCondition = true;
        RunnerModel runnerModel = new RunnerModel(360, 480, 84, 36);
        Jump jump = new Jump(runnerModel);
        Run run = new Run(runnerModel);

        while(loopCondition) {
            String menuChoice;
            Scanner scanner = new Scanner(System.in);
            System.out.println("A.) Practice Jumping \n B.) Practice Running \n C.) See Previous Times and Jumps \n Q.) Quit");
            menuChoice = scanner.nextLine();

            switch (menuChoice.toLowerCase()) {
                case "a":
                    jump.practiceJump();
                    break;
                case "b":
                    run.practiceRun();
                    break;
                case "c":
                    Results.seeAllRecords();
                    break;
                case "q":
                    loopCondition = false;
                    break;
                default:
                    menu();
            }
        }
    }
}
