import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Marwan on 07 Jan, 2024 around 3:24 PM
 */
public class Test4 {

    public static void main(String[] args) {
        SurveyCalculation survey = new SurveyCalculation();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter current depth ");
        double currentDepth = sc.nextDouble();

        System.out.println("enter previous depth ");
        double prevDepth = sc.nextDouble();

        System.out.println("enter current inclination ");
        double inc2 = sc.nextDouble();

        System.out.println("enter previous inclination ");
        double inc1 = sc.nextDouble();

        System.out.println("enter current azimuth ");
        double az2 = sc.nextDouble();

        System.out.println("enter previous azimuth ");
        double az1 = sc.nextDouble();

        System.out.println("enter previous TVD ");
        double tvd1 = sc.nextDouble();

        System.out.println("enter previous North / South ");
        double ns1 = sc.nextDouble();

        System.out.println("enter previous East / West ");
        double ew1 = sc.nextDouble();

        System.out.println("enter target Azimuth ");
        double targetAz = sc.nextDouble();

        double courseLength = survey.courseLength(currentDepth, prevDepth);
        double dogLeg = survey.dogLeg(inc2, inc1, az2, az1);
        double smoothFactor = survey.smoothFactor(dogLeg);

        double deltaNS = survey.changeNorthSouth(inc1, inc2, az1, az2, smoothFactor, courseLength);
        double deltaEW = survey.changeEastWest(inc1, inc2, az1, az2, smoothFactor, courseLength);
        double deltaTVD = survey.changeInTVD(inc1, inc2, smoothFactor, courseLength);

        double totalNS = survey.total_northSouth(deltaNS, ns1);
        double totalEW = survey.total_eastWest(deltaEW, ew1);
        double totalTVD = survey.total_TVD(deltaTVD, tvd1);

        double dls = survey.dogLegSeverity(dogLeg, courseLength);
        double closureAngel = survey.closureAngle(totalNS, totalEW);
        double dd = survey.directionalDifference(targetAz, closureAngel);
        double closureDistance = survey.closureDistance(totalNS, totalEW);
        double verticalSection = survey.verticalSection_VS(closureDistance,dd);

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Depth    Inc    Az      TVD      Vsec    N/S    E/W     DLS   CD      CA");

        System.out.println(
               currentDepth+"  "+inc2+"  "+az2+"  "+df.format(totalTVD)+"  "+df.format(verticalSection)
                +"  "+df.format(totalNS)+"  "+df.format(totalEW)+"  "+df.format(dls)+"  "+df.format(closureDistance)
                +"  "+df.format(closureAngel)+" "

        );

    }
}




/*
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Depth,   Inc,   Az,    TVD,    Vsec,   N/S,   E/W,    DLS,  CD,     CA");

        System.out.println(currentDepth+"  "+currentInc+"  "+currentAz+"  "+df.format(tvd2)+"  "+df.format(vs)
                +"  "+df.format(totalNS)+"  "+df.format(totalEW)+"  "+df.format(dls)+"  "+df.format(closureDistance)+
                "  "+df.format(closureAngel));

        */