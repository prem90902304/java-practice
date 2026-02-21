import java.util.*;

public class leafyear {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter the year to check it is leaf year or not:");

        int year = input.nextInt();

        if (year%4==0){

            if (year%100==0){

                if (year%400==0){

                     System.out.println("Its a leaf year");
                }
                else
                     System.out.println("Its not a leaf year");
            }
            else
                 System.out.println("Its a leaf year");
        }
        else
            System.out.println("Its not a leaf year");

    }
}
