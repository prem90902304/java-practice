public class max {
    public static void main(String [] args){
        int num = 12546;
        int max = Integer . MIN_VALUE;
        int min = Integer . MAX_VALUE;
        while(num>0){
            int d =num%10;
            if (d>max)
                max=d;

            if(d<min)
                min=d;

            num=num/10;

        }
        System.out.println(min);
        System.out.println(max);

    }
}
