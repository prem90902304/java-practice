import java.util.*;
public class num_binary {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number to convert number to binary");
        int num =  input.nextInt();
        String rem="";
        int i=0;
        while (num>i) {
            int d= num%2;
            rem=d+rem;
            num=num/2;
            
        }
        System.out.println("Number converted to binary:"+rem);
         
    }
}
