import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * Created by: Marwan on ${DATE} around ${TIME}
 */
public class Main {
    public static void main(String[] args) {

/*
int[] intArr = {1, 2, 3, 4, 5, 6};

        for (int j : intArr) {
            System.out.println(j);
        }
 */
        String name = "Marwan ";

        /*
        System.out.println("my" + "" + "name length is " + name.length() + " characters");
        double acrMeasurement = 55;
        double circumference = 88;
          toolFace = (acrMeasurement / circumference) * 360;
        System.out.println(toolFace);
        String combo = "hello " + circumference;
        System.out.println(combo);
        System.out.println(Math.max(acrMeasurement,circumference));
        System.out.println(Math.pow(2, 4));
        System.out.println(Math.cos(0));

         */

        /*
        SurveyCalculation calculation = new SurveyCalculation();
        System.out.println("delta MD is " + calculation.courseLength(3522, 3425));
        System.out.println("Dog leg is " + calculation.dogLeg(8, 10.75, 285, 282));
        System.out.println("******************************************");
        System.out.println(Math.toDegrees(1.8099));
        System.out.println(Math.sin(Math.toDegrees(30)));
        System.out.println(Math.sin(Math.toDegrees(45)));

         */

        /*
        double num = Math.sin(8) * Math.sin(10.75) * Math.cos(282 - 285);
        double num2 = Math.cos(8) + Math.cos(10.75);
        double res1 = num + num2;
        System.out.println(Math.toDegrees(num2));

         */

        // Average angle method
        /*
        double cons = (180/Math.PI);
        System.out.println("first part :"+cons * Math.sin(8));
        System.out.println("second part :"+ cons * Math.sin(10.75 ));
        System.out.println("third part :"+cons* Math.cos(-3 ));
        System.out.println("forth part :"+cons * Math.cos(8));
        System.out.println("fifth part :" +cons* Math.cos(10.75));
        System.out.println(-0.3015246456200019 *0.17653954590738763* -0.6214083129159854);
        System.out.println(0.9534583829846651*0.9842935480489615);
        System.out.println("sum is "+(0.03307820082959266+0.9384829347050017));
        System.out.println(Math.acos(0.9715611355345943)*cons);
        System.out.println(Math.acos(0.99881281)*cons);
        System.out.println("******************************");
        System.out.println(Math.sin(8*cons) * Math.sin(10.75 *cons) *Math.cos(-3*cons ));
        System.out.println(Math.cos(8 * cons) * Math.cos(10.75 * cons));
        System.out.println("=======================");
        System.out.println(Math.cos(8*cons));
        System.out.println("****************");
        System.out.println(Math.cos(-3*cons));
        System.out.println(Math.cos(60*cons));
        System.out.println("///////////////////////////////");
        double blah = Math.cos(Math.toRadians(60));
        System.out.println(blah);
        System.out.println("***************************");
        double firstPart = Math.sin(Math.toRadians(10));
        System.out.println(firstPart);
        System.out.println(Math.sin(Math.toRadians(8)) * Math.sin(Math.toRadians(10.75)) * Math.cos(Math.toRadians(282 - 285)));
        System.out.println(Math.cos(Math.toRadians(10.75))*Math.cos(Math.toRadians(8)));
        System.out.println(0.025923552411518665+0.9728892579900281);
        System.out.println(Math.toDegrees(Math.acos(0.9988128104015468)) ); // pay attention here
        System.out.println("****");
        System.out.println(Math.sin(Math.toRadians(60)));
        System.out.println("*************************************************");
        System.out.println();

         */

        /*
        SurveyCalculation surveyCalculation = new SurveyCalculation();
        System.out.println("Measured Depth is: "+surveyCalculation.courseLength(3522,3425));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Dog leg is: "+surveyCalculation.dogLeg(10.75, 8, 282, 285));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Ratio Factor is: "+surveyCalculation.smoothFactor(2.792));
        System.out.println("********************Good Job***************Continue");
        System.out.println("North/South is: "+surveyCalculation.changeNorthSouth(8, 10.75, 285, 282, 1.0002, 97));
        System.out.println("********************Good Job***************Continue");
        System.out.println("East/West is: "+surveyCalculation.changeEastWest(8,10.75,285,282,1.0002,97));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Change in TVD is: "+surveyCalculation.changeInTVD(8,10.75,1.0002,97));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Total TVD is: "+surveyCalculation.total_TVD(95.7,3402.00));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Total North/South is: "+surveyCalculation.total_northSouth(3.6285826461746704,6.25));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Total East/West is: "+surveyCalculation.total_eastWest(-15.37,-12.58));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Closure Distance is: "+surveyCalculation.closureDistance(9.87858264617467,-27.95));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Closure Angel is: "+surveyCalculation.closureAngle(9.88,-27.95));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Directional Difference DD is: "+surveyCalculation.directionalDifference(286,289.47));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Vertical Section is: "+surveyCalculation.verticalSection_VS(29.644,-3.47));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Dog Leg Severity is: "+surveyCalculation.dogLegSeverity(2.792,97));

         */ // first example

        /*
        SurveyCalculation calc = new SurveyCalculation();
        System.out.printf("course length is: " + calc.courseLength(3618, 3522));
        System.out.println();
        System.out.printf("dog leg is: " + calc.dogLeg(14, 10.75, 273, 282));
        System.out.println();
        System.out.printf("smooth factor is: " + calc.smoothFactor(3.77));
        System.out.println();
        System.out.printf("change is north/south is: " + calc.changeNorthSouth(10.75, 14, 282, 273, 1.00036, 96));
        System.out.println();
        System.out.printf("change is east/west is: " + calc.changeEastWest(10.75, 14, 282, 273, 1.00036, 96));
        System.out.println();
        System.out.printf("change is TVD is: " + calc.changeInTVD(10.75, 14, 1.00036, 96));

         */


    }
}