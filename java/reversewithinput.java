import java.util.Scanner;
class reversewithinput{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int num = input.nextInt();
        while (num!=0) {
            System.out.println(num);

            --num;
            
        }

    }
}