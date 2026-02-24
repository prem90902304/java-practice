import java.util.Scanner;
public class len{
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = se.nextInt();
        int len = (int)Math.log10(num) + 1 ;
        System.out.println("Length of the number is:" + len);
    }

}
