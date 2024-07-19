package SurveyCalculations;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Marwan on 19 Jul, 2024 around 1:13 AM
 */
public class GetSumNum {

    public static void main(String[] args) {
        System.out.println("Hello world");

        Integer deg1 = 60;
        List<Double> degrees = new ArrayList<>(Arrays.asList(30.0,40.0,50.0,60.0,70.0,80.0,90.0));

        degrees.forEach(a-> System.out.println(Math.cos(Math.toRadians(a))));
        System.out.println(convertDegreesToRadians(deg1));


        /*
        System.out.println(Math.sin(Math.toRadians(deg1)));
        System.out.println(Math.cos(Math.toRadians(deg1)));
        System.out.println("######################");
        System.out.println(Math.sin(deg1));
        System.out.println(Math.cos(deg1));

         */

    }

    public static Double convertDegreesToRadians(Integer deg){

        return deg * (Math.PI/180);
    }

}
