import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by christiancampbell on 6/5/17.
 */
public class Results {
    static ArrayList<Integer> jumpList = new ArrayList<>(); //arrayLists to hold the jump results and run results.
    static ArrayList<Integer> runList = new ArrayList<>();
    private static double jumpSum;
    private static double runSum;
    static DecimalFormat df = new DecimalFormat("#.00"); // Set your desired format here.


    public static void seeAllRecords(){ //displays results from most of the methods below.
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

    public static int getHighestJump(){//Uses the collections import to give us the highest number in the array.
        if(jumpList.size() != 0){
            return Collections.max(jumpList);
        }else{
            return 0; // 0 is the lowest possible number.
        }
    }

    public static int getLowestRun(){ //Uses the collections import to automatically give us the lowest number in the array. This is used to determine a best time.
        if(runList.size() != 0){
            return Collections.min(runList);
        }else{
            return 480; //480 is the lowest number possible by the predetermined model.
        }
    }
    public static String getJumpAverage(){ //gets average from the running time arraylist.
        if(!jumpList.isEmpty()) { //checks if the list is empty first, if it is not, all the numbers together.
            for (Integer averageTotal : jumpList) { // for each loop to add each number together.
                jumpSum += averageTotal;
            }
            return  df.format(jumpSum/ jumpList.size()) + " inches"; // divides total number by the size of the array.
        }else{
            return jumpSum + ""; //return 0 if the array size is 0.
        }
    }

    public static String getRunAverage(){ //gets average from the running time arraylist.
        if(!runList.isEmpty()) { //checks if the list is empty first, if it is not, all the numbers together.
            for (Integer averageTotal : runList) { // for each loop to add each number together.
                runSum += averageTotal;
            }
            return  df.format(runSum/ runList.size()) + " seconds"; // divides total number by the size of the array.
        }else{
            return runSum + ""; //return 0 if the array size is 0.
        }
    }
    public static void resetValues(){ //resets our variables so they are refreshed when the user selects to see the results again.
        jumpSum = 0;
        runSum = 0;
    }
}
