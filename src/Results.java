import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class Results {
    static ArrayList<Integer> jumpList = new ArrayList<>();
    static ArrayList<Integer> runList = new ArrayList<>();
    private static double jumpSum;
    private static double runSum;



    public static void seeAllRecords(){
        System.out.println("Jump: " + jumpList);
        System.out.println("Run: " + runList);
        System.out.println("Average Jump: " + getJumpAverage());
        System.out.println("Average Run: " + getRunAverage() + "");
        resetValues();


    }
    public static void addJumpRecord(int jumpInfo){
        jumpList.add(jumpInfo);
    }
    public static void addRunRecord(int runInfo){
        runList.add(runInfo);
    }

    public static int getHighestJump(){
        if(jumpList.size() != 0){
            return Collections.max(jumpList);
        }else{
            return 0;
        }
    }

    public static int getLowestRun(){
        if(runList.size() != 0){
            return Collections.min(runList);
        }else{
            return 480;
        }
    }
    public static double getJumpAverage(){
        if(!jumpList.isEmpty()) {
            for (Integer averageTotal : jumpList) {
                jumpSum += averageTotal;
            }
            return  jumpSum/ jumpList.size();
        }else{
            return jumpSum;
        }
    }

    public static double getRunAverage(){
        if(!runList.isEmpty()) {
            for (Integer averageTotal : runList) {
                runSum += averageTotal;
            }
            return  runSum/ runList.size();
        }else{
            return runSum;
        }
    }
    public static void resetValues(){
        jumpSum = 0;
        runSum = 0;
    }
}
