package Week_1_HW_030123;

import java.sql.SQLOutput;

public class Automation_AI01p2 {
    public static void main(String[] args) {
        //create region list in linear array
        String[] region = new String [] {"USA", "India", "Australia", "Mexico"};

        //create region code in linear array
        int[] regionCode = new int [] {1, 356, 61, 52};
        int i = 0;
        while (i < region.length){
            System.out.println("My region is "+region[i] +" and my area code is " +regionCode[i]);
            i= i+1;
    }

}}
