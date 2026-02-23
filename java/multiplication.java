import java.util.*;
public class multipication {
    public static void main(String[] args){
        Scanner se=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = se.nextInt();
         System.out.println("Multiplication Table For Given Number Is:");
        for (int i = 1; i <=10; i++) {
            System.out.println(num+" x " + i+" = " + num*i);
        }

        }
    }

