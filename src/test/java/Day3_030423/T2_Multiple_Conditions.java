package Day3_030423;

public class T2_Multiple_Conditions {
    public static void main(String[] args) {

        //using multiple conditional statements verify when a+b > c, a+b < c & a+b == c
        int a = 2;
        int b = 3;
        int c = 5;

        if(a+b > c){
            System.out.println("a & b is greater than c");
        } else if (a+b < c) {
            System.out.println("a & b is less than c");
        } else if(a+b == c) {
            System.out.println("a & b is equal to c");
        }

    }//end of main
}//end of class
