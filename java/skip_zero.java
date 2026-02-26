public class skip_zero {
    public static void main(String[] args) {
        int array[]={10,0,5,0,2};
        for(int i =0;i<array.length;i++){
            if(array[i]==0){
                continue;
            }
            System.out.println(array[i]);
        }
    }
    
}
