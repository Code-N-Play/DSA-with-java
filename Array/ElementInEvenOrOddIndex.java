public class ElementInEvenOrOddIndex{
    public static void main (String[] args){

        int[] array = {4,55,88,75,12,3,699,40};
        int array_len = array.length;

        String evenIndex = "";
        String oddIndex = "";

        for(int i = 0 ; i < array_len ; i++){
            if (i % 2 == 0 ){
                int ele = array[i];
                String ele_str = String.valueOf(ele);
                evenIndex = evenIndex + " " + ele_str ;
            }
            else{
                int ele2 = array[i];
                String ele2_str = String.valueOf(ele2);
                oddIndex = oddIndex + " " + ele2_str ;

            }
        }

        System.out.println( "Even index Elements : " + evenIndex);
        System.out.println("Odd index Elements : " + oddIndex);
    }
}