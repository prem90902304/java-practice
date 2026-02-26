public class print_validmarks {
    public static void main(String[] args) {
        int array[]={90,-10,85,120,70};
        for(int i =0;i<array.length;i++){
            if(array[i]>=0 && array[i]<=100){
                continue;
            }
            System.out.println("Invalid num:"+array[i]);
        }
    }
    
}
