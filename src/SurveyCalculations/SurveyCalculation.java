package SurveyCalculations;

/**
 * Created by: Marwan on 12/19/2023 around 7:41 PM
 */
public class SurveyCalculation {

    static final double cons = 180 / Math.PI;

    public double courseLength(double currentDepth, double previousDepth) {
        return (currentDepth - previousDepth);
    }

    public double dogLeg(double inc2, double inc1, double az2, double az1) {

        double firstPart = Math.sin(Math.toRadians(inc1)) * Math.sin(Math.toRadians(inc2)) * Math.cos(Math.toRadians(az2 - az1));
        double secondPart = Math.cos(Math.toRadians(inc1)) * Math.cos(Math.toRadians(inc2));
        return Math.toDegrees(Math.acos(firstPart + secondPart));

    }

    public double smoothFactor(double dogLeg) {
        return Math.tan(Math.toRadians(dogLeg / 2)) * cons * (2 / dogLeg);
    }

    public double changeNorthSouth(double inc1, double inc2, double az1, double az2, double smoothFactor, double courseLength) {
        double firstPart = Math.sin(Math.toRadians(inc1)) * Math.cos(Math.toRadians(az1));
        double secondPart = Math.sin(Math.toRadians(inc2)) * Math.cos(Math.toRadians(az2));
        double thirdPart = smoothFactor * (courseLength / 2);
        return (firstPart + secondPart) * thirdPart;

    }

    public double changeEastWest(double inc1, double inc2, double az1, double az2, double smoothFactor, double courseLength) {
        double firstPart = Math.sin(Math.toRadians(inc1)) * Math.sin(Math.toRadians(az1));
        double secondPart = Math.sin(Math.toRadians(inc2)) * Math.sin(Math.toRadians(az2));
        double thirdPart = smoothFactor * (courseLength / 2);
        return (firstPart + secondPart) * thirdPart;
    }

    public double changeInTVD(double inc1, double inc2, double smoothFactor, double courseLength) {

        double firstPart = Math.cos(Math.toRadians(inc1)) + Math.cos(Math.toRadians(inc2));
        double secondPart = smoothFactor * (courseLength / 2);
        return firstPart * secondPart;
    }

    public double total_TVD(double changeInTVD, double previousTVD) {

        return previousTVD + changeInTVD;
    }

    public double total_northSouth(double changeNorthSouth, double previousNorthSouth) {
        return previousNorthSouth + changeNorthSouth;
    }

    public double total_eastWest(double changeEastWest, double previousEastWest) {

        return changeEastWest + previousEastWest;
    }

    public double closureDistance(double total_northSouth, double total_eastWest) {

        return Math.sqrt(Math.pow(total_northSouth, 2) + Math.pow(total_eastWest, 2));
    }

    public double closureAngle(double total_northSouth, double total_eastWest) {

        return Math.abs(Math.atan(total_eastWest / total_northSouth) * cons);
    }

    public double directionalDifference(double targetDirection, double closureAngel) {

        return targetDirection - closureAngel;
    }

    public double verticalSection_VS(double closureDistance, double directionalDifference) {

        return closureDistance * Math.cos(Math.toRadians(directionalDifference));
    }

    public double dogLegSeverity(double dogLeg, double courseLength) {

        return (dogLeg * 100) / courseLength;
    }


}
