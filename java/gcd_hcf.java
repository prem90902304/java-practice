public class gcd_hcf {
    public static void main (String []args){
        int a=36,b=60;
        int min;
         
         min=(a>b)?b:a;
         int update=0;
         for(int i=1;i<=min;i++){
            if((a%i==0) && (b%i==0) ){
                if(i>update)
                    update=i;
            }
         }
        System.out.println(update);
    }
    
}
