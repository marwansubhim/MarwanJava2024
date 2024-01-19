package SurveyCalculations;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
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
        SurveyCalculations.SurveyCalculation calculation = new SurveyCalculations.SurveyCalculation();
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


        SurveyCalculation surveyCalculation = new SurveyCalculation();
        System.out.println("Measured Depth is: "+surveyCalculation.courseLength(7836,7740));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Dog leg is: "+surveyCalculation.dogLeg(60.46,52.23,326.92,327.12));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Ratio Factor is: "+surveyCalculation.smoothFactor(surveyCalculation.dogLeg(60.46,52.23,326.92,327.12)));
        System.out.println("********************Good Job***************Continue");
        System.out.println("North/South is: "+surveyCalculation.changeNorthSouth(52.23, 60.46, 327.12, 326.92, surveyCalculation.smoothFactor(surveyCalculation.dogLeg(60.46,52.23,326.92,327.12)), 96));
        System.out.println("********************Good Job***************Continue");
        System.out.println("East/West is: "+surveyCalculation.changeEastWest(52.23,60.46,327.12,326.92,surveyCalculation.smoothFactor(surveyCalculation.dogLeg(60.46,52.23,326.92,327.12)),96));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Change in TVD is: "+surveyCalculation.changeInTVD(52.23,60.46,surveyCalculation.smoothFactor(surveyCalculation.dogLeg(60.46,52.23,326.92,327.12)),96));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Total TVD is: "+surveyCalculation.total_TVD(53.16,7592));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Total North/South is: "+surveyCalculation.total_northSouth(66.97,-352.71));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Total East/West is: "+surveyCalculation.total_eastWest(-43.466,44.3));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Closure Distance is: "+surveyCalculation.closureDistance(-285.74,0.83));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Closure Angel is: "+surveyCalculation.closureAngle(-285.74,0.83));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Directional Difference DD is: "+surveyCalculation.directionalDifference(330,0.166));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Vertical Section is: "+surveyCalculation.verticalSection_VS(285.74,-3.47));
        System.out.println("********************Good Job***************Continue");
        System.out.println("Dog Leg Severity is: "+surveyCalculation.dogLegSeverity(8.23,96));
        System.out.println("**************************");

        System.out.println(29.6448 * Math.cos(Math.toRadians(-3.47)));
        System.out.println(285.74 * Math.cos(Math.toRadians(0.1664)));



        // first example
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter you current depth");
        double md2 = scanner.nextDouble();
        System.out.println("enter you previous depth");
        double md1 = scanner.nextDouble();
        System.out.println("enter current inc");
        double inc2 =  scanner.nextDouble();
        System.out.println("enter your previous inc");
        double inc1 = scanner.nextDouble();
        System.out.println("enter your current Azimuth");
        double az2 = scanner.nextDouble();
        System.out.println("enter your previous Azimuth");
        double az1 = scanner.nextDouble();
        System.out.println("enter your previous TDV");
        double tvd1 = scanner.nextDouble();
        System.out.println("enter previous north/south coordinates");
        double northSouth = scanner.nextDouble();
        System.out.println("enter previous east/west coordinates");
        double eastWest = scanner.nextDouble();
        System.out.println("enter your target azimuth");
        double targetDirection = scanner.nextDouble();
        System.out.println("Here are your surveys attributes");


        SurveyCalculations.SurveyCalculation calc = new SurveyCalculations.SurveyCalculation();
       double courseLength =  calc.courseLength(md2, md1);
       double dogLeg =  calc.dogLeg(inc2,inc1,az2,az1);
       double smoothFactor = calc.smoothFactor(dogLeg);
       double deltaNS = calc.changeNorthSouth(inc1,inc2,az1,az2,smoothFactor,courseLength);
       double deltaEW = calc.changeEastWest(inc1,inc2,az1,az2,smoothFactor,courseLength);
       double deltaTVD = calc.changeInTVD(inc1,inc2,smoothFactor,courseLength);
       double totalTVD = calc.total_TVD(deltaTVD,tvd1);
       double totalNorthSouth = calc.total_northSouth(deltaNS,northSouth);
       double totalEastWest = calc.total_eastWest(deltaEW,eastWest);
       double closureDistance = calc.closureDistance(totalNorthSouth,totalEastWest);
       double closureAngel = calc.closureAngle(totalNorthSouth,totalEastWest);
       double dd = calc.directionalDifference(targetDirection,closureAngel);
       double vs = calc.verticalSection_VS(closureDistance,dd);
       double dls = calc.dogLegSeverity(dogLeg,courseLength);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("CL: "+courseLength+" Inc: " +inc2+" Az: "+az2+" TVD: "+df.format(totalTVD)+" VS: "+df.format(vs)
                +" N/S: "+df.format(totalNorthSouth)
                +" E/W: "+df.format(totalEastWest)+" DLS: "+df.format(dls)+" CD: "+df.format(closureDistance)+" CA: "+
                df.format(closureAngel));

         */


        /*
       String str = "CL: "+courseLength+" Inc: " +inc2+" Az: "+az2+" TVD: "+totalTVD+" VS: "+vs+" N/S: "+totalNorthSouth
               +" E/W: "+totalEastWest+" DLS: "+dls+" CD: "+closureDistance+" CA: "+closureAngel;
        DecimalFormat df = new DecimalFormat("#.##");

        df.format(totalTVD);
        df.format(vs);
        df.format(totalNorthSouth);
        df.format(totalEastWest);
        df.format(dls);
        df.format(closureDistance);
        df.format(closureAngel);

         */


        /*
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