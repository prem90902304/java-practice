class reverse{
    static int rev_number(int a){
        int rev1 = 0;
        while(a>0){
            int d=a%10;
            rev1=rev1*10+d;
            a=a/10;
        }
        return (rev1);

    }
    public static void main(String []args){
        int n=1221;
        int rev=rev_number(n);
        if(n==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palidrome");
    }
}