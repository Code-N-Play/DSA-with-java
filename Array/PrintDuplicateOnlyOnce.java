public class PrintDuplicateOnlyOnce{
    public static void main (String[] args){
        int[] array = {1,2,1,3,1,2,5,2,3,56,4,56,2};
        int array_len = array.length;
        String output = "";
       
        for(int i = 0 ; i < array_len ; i ++){
            int ele = array[i];
            String ele_str = String.valueOf(ele);

            if (!output.contains(ele_str)){  // output.contains() ye pura syntex hume boolean value deta hai to shuru mai !(not ka use kr sakte hai)
                output  = output + ele_str + ", ";
            }
        }
        System.out.println("Printing Duplicate value only once");
        System.out.println(output);
    }
}