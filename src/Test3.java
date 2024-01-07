import java.text.DecimalFormat;

/**
 * Created by Marwan on 07 Jan, 2024 around 2:28 PM
 */
public class Test3 {

    public static void main(String[] args) {
        System.out.println("Ya Allah");
        /**
         * Calculate the survey attributes for the following given data
         * md2 = 3118, md1 = 3024
         * inc2 = 30.68, inc1 = 27.77
         * az2 = 27.87, az1 = 32.60
         * tvd1 = 2941.5, vs1 = 260.31
         * ns1 = 429.79, ew1 = 226.65
         */

        SurveyCalculation svy = new SurveyCalculation();

        double currentDepth = 3118;
        double currentInc = 30.68;
        double currentAz = 27.87;

        double cl = svy.courseLength(3118, 3024);
        System.out.println("course length is: " + cl);

        double dogLeg = svy.dogLeg(30.68, 27.77, 27.87, 32.60);
        System.out.println("dog leg is: " + dogLeg);

        double smoothFactor = svy.smoothFactor(dogLeg);
        double deltaNS = svy.changeNorthSouth(27.77, 30.68, 32.6, 27.87, smoothFactor, cl);
        double deltaEW = svy.changeEastWest(27.77, 30.68, 32.6, 27.87, smoothFactor, cl);
        double deltaTVD = svy.changeInTVD(27.77, 30.68, smoothFactor, cl);

        double tvd2 = svy.total_TVD(deltaTVD, 2941.5);
        System.out.println("TVD is: " + tvd2);

        double totalNS = svy.total_northSouth(deltaNS, 429.79);
        System.out.println("total NS: " + totalNS);

        double totalEW = svy.total_eastWest(deltaEW, 226.65);
        System.out.println("total EW: " + totalEW);

        double closureDistance = svy.closureDistance(totalNS, totalEW);
        System.out.println("closure distance is: " + closureDistance);

        double closureAngel = svy.closureAngle(totalNS, totalEW);
        System.out.println("closure angel is: " + closureAngel);

        double dls = svy.dogLegSeverity(dogLeg, cl);
        System.out.println("DLS is: " + dls);

        double dd = svy.directionalDifference(330.2, closureAngel);
        double vs = svy.verticalSection_VS(closureDistance, dd);
        System.out.println("VS is: " + vs);
        System.out.println("***********************************************************************");

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Depth,  Inc,  Az,  TVD,  Vsec,  N/S,  E/W,  DLS,  CD,  CA");

        System.out.println(currentDepth+"  "+currentInc+"  "+currentAz+"  "+df.format(tvd2)+"  "+df.format(vs)
        +"  "+df.format(totalNS)+"  "+df.format(totalEW)+"  "+df.format(dls)+"  "+df.format(closureDistance)+
                "  "+df.format(closureAngel));


    }

}
