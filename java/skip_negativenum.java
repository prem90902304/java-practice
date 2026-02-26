public class skip_negativenum {
    public static void main(String[] args) {
        int array[]={10,-5,20,-3,15};
        for(int i =0;i<array.length;i++){
            if(array[i]<=0){
                continue;
            }
            System.out.println(array[i]);
        }

    }
    
}
