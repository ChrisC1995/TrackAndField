/**
 * Created by christiancampbell on 6/6/17.
 */
public class LengthConversion {

    private int inchesToFeet;
    private int remainingInches;

    public String lengthConverter(int inches){
            inchesToFeet = inches / 12; //gets the feet.
            remainingInches = inches % 12; // gets the remaining inches
            return inchesToFeet + " FT. " + remainingInches + " Inches "; //displays the results.
    }
}
