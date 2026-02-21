import java.util.*;

public class amstrongnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Amstrong Num:");
        int am = input.nextInt();
        int dig_count=(int)Math.log10(am)+1;
        int sum=0;
        int org=am;

        while (am > 0) {
            int d=am%10;
            int power=(int)Math.pow(d, dig_count);
            sum=sum+power;
            am=am/10;
        }
        if (org==sum)

        System.out.println("Its a amstrong number");
        else
        System.out.println("Not an amstong number");


        
    }

    

}
