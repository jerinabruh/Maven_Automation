package Week_1_HW_030123;

import java.util.ArrayList;

public class Automation_AI01 {
    public static void main(String[] args) {
        // using arraylist for string country & Integer countryCode w/ for loop

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("India");
        countries.add("Australia");
        countries.add("Mexico");

        //create an Integer arrayList of area code
        ArrayList<Integer> countryCode = new ArrayList<>();
        countryCode.add(1);
        countryCode.add(356);
        countryCode.add(61);
        countryCode.add(52);

        for (int i = 0; i < countryCode.size(); i++){
            System.out.println("My country is " + countries.get(i) + " and my country code is " + countryCode.get(i));
        }
    }
}
