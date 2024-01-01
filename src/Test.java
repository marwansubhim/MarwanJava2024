import java.text.DecimalFormat;

/**
 * Created by: Marwan on 1/1/2024 around 12:15 PM
 */
public class Test {

    public static void main(String[] args) {
        SurveyCalculation calc = new SurveyCalculation();
        double courseLength = calc.courseLength(2406, 2316);
        double dogLeg = calc.dogLeg(12.15, 14.66, 238.89, 245.9);
        double smoothFactor = calc.smoothFactor(dogLeg);
        System.out.println(courseLength);
        System.out.println(dogLeg);
        System.out.println(smoothFactor);
        double dls = calc.dogLegSeverity(dogLeg, courseLength);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        decimalFormat.format(dls);


        System.out.println(decimalFormat.format(dls));


    }
}
