package Week_2_HW_030823;

public class Automation_A102 {
    public static void main(String[] args) {

        int grade = 78;

        if(grade >= 90 && grade <=100){
            System.out.println("Grade A");
        } else if(grade >= 80 && grade <= 89)
            System.out.println("Grade B");
        else if (grade >= 70 && grade <= 79)
            System.out.println("Grade C");
        else if(grade >= 60 && grade <= 69)
            System.out.println("Grade D");
        else if(grade >= 0 && grade <= 59)
            System.out.println("Grade F");

    }//end of main
}//end of class
