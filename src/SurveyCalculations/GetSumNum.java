package SurveyCalculations;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marwan on 19 Jul, 2024 around 1:13 AM
 */
public class GetSumNum {

    public static final Double EARTH_RADIUS = 3958.8;

    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println("******************************************");
        Integer deg1 = 60;
        List<Double> degrees = new ArrayList<>(Arrays.asList(30.0, 40.0, 50.0, 60.0, 70.0, 80.0, 90.0));
        System.out.println(degrees);
        System.out.println("******************************************");
        System.out.println(convertDegreesToRadians(degrees));
        /*
        System.out.println(Math.sin(Math.toRadians(deg1)));
        System.out.println(Math.cos(Math.toRadians(deg1)));
        System.out.println("######################");
        System.out.println(Math.sin(deg1));
        System.out.println(Math.cos(deg1));
        degrees.forEach(a-> System.out.println(Math.cos(Math.toRadians(a))));
        System.out.println(convertDegreesToRadians(deg1));
         */

        DecimalFormat d = new DecimalFormat("#.#####");

        System.out.println(d.format(vincentyDistFrom(-49.5, 69, -53.1, -36.5)));
        System.out.println(d.format(haversineDistForm(-49.5, 69, -53.1, -36.5)));



    }

    public static Double convertDegreesToRadians(Double deg){

        return deg * (Math.PI/180);
    }

    public static List<Double> convertDegreesToRadians(List<Double> degreeList){

        List<Double> radiansList = new ArrayList<>();
        for(Double num: degreeList){
            radiansList.add(convertDegreesToRadians(num));
        }
        return radiansList;
    }

    public static double vincentyDistFrom(double lat1, double lng1, double lat2, double lng2) {

        double dLat = Math.toRadians(lat2 - lat1);
        double dLng = Math.toRadians(lng2 - lng1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) + Math.cos(Math.toRadians(lat1))
                * Math.cos(Math.toRadians(lat2)) * Math.sin(dLng / 2) * Math.sin(dLng / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        double dist = (double) (EARTH_RADIUS * c);
        return dist;
    }

    public static double haversineDistForm(double lat1, double lon1, double lat2, double lon2) {

        double dlat = Math.toRadians(lat2 - lat1);
        double dlon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dlat / 2) * Math.sin(dlat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dlon / 2) * Math.sin(dlon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        return EARTH_RADIUS* c;
    }

}
