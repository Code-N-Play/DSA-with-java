public class Second_largest_element{
    public static void main (String[] arsg){

        int[] array = {1,2,8,54,32,48,105,225,3,301,299};
        int array_len = array.length;

        int temp = 0;
        for (int i = 0 ; i < array_len ; i++){
            int element = array[i];
            if(temp < element){
                temp = element;
            }
        }

        int[] new_array = new int[array_len];

        for(int i = 0 ; i < array_len ; i++){
            
            if(array[i] != temp){
                new_array[i] = array[i]; 
            }
            else {
                new_array[i] = 0; 
            }
        }
        int second_largest = 0;

        for(int i = 0 ; i < array_len ; i++){
            int element = new_array[i];
            if(second_largest < element ){
                second_largest = element;
            }
        }

        System.out.println(second_largest);
    }
}

// approche = largest ko find kr lo or new array banao usme largest ki jagah 0 dalo phir again largest find karo automaticaly second largest mil jaega 