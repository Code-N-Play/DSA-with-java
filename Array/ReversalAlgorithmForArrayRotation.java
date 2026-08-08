// array right rotation using reversal method ( classical DSA algo , it is use to rotate array by reversing )

// hoe to implement 
// ek given array hai
// phle usko reverse karo
// phle n element ko reverse karo  
// after that remaining elements ko reverse karo 
// array rotate ho jaega without using rotation method 

import java.util.Scanner;

public class ReversalAlgorithmForArrayRotation{
    public static void main (String[] args){

System.out.println("Enter the Rotation Position ....");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] array = {1,2,3,4,5};
        int array_len = array.length;
        int temp = 0 ;
        int a = 0 ;
        int half = Math.round(array_len/2);

        for(int  i= 0 ; i < half ; i++ ){
            temp = array[i];
            array[i] = array[(array_len-1)-i];
            array[(array_len-1)-i] = temp ;
        }

        int k_half = Math.round(k/2);

        for(int i = 0 ; i < k_half ; i++){
            temp = array[i];
            array[i] = array[(k-1)-i];
            array[(k-1)-i] = temp ;
        }

        int rest = array_len - k ;
        int rest_half = Math.round(rest/2);

        for(int i = k ; i < k+rest_half ; i++){
            temp = array[i];
            array[i] = array[(array_len-1)-a];
            array[(array_len-1)-a] = temp;
            a=a+1;
        }

        System.out.println("Final Array " + half);
        for(int i = 0 ; i < array_len ; i++){
            System.out.print(array[i] + ", ");
        }
        
    }
}





// mera dimag kharab tha mai less merory use krne ki jagah jada use kr reha tha 

// import java.util.Scanner;

// public class ReversalAlgorithmForArrayRotation{
//     public static void main (String[] args){

// System.out.println("Enter the Rotation Position ....");
//         Scanner sc = new Scanner(System.in);
//         int k = sc.nextInt();

//         int[] array = {1,2,3,4,5};
//         int array_len = array.length;
//         int temp = 0 ;
//         int a = 0 ;
//         int half = Math.round(array_len/2);

// System.out.println("Enter the Rotation Position ....");
// Scanner sc = new Scanner(System.in);
// int k = sc.nextInt();

// int[] array = {1,2,3,4,5};
// int array_len = array.length;
// int temp = 0 ;
// int a = 0 ;

// int[] new_array = new int[array_len];
// for(int i = array_len-1 ; i >= 0 ; i--){
//     new_array [a] = array[i];
//     a = a+ 1;
// }

// int[] first_sub = new int[k];
// int b=k-1;
// for(int i = 0 ; i < k ; i++){
//     first_sub[i] = new_array[b];
//     b=b-1;                         
// }

// int[] second_sub = new int[array_len-k]; 
// int c = 0;
// for(int i = array_len-1 ; i > k-1 ; i--){ 
//     second_sub[c] = new_array[i]; 
//     c =c+1;
// }

// int[] final_array = new int[array_len];
// int d = 0;
//         for(int i = 0 ; i < array_len ; i++){
//            if(i < k){
//                final_array[i] = first_sub[i];  
//              }
//              else{
//                final_array[i] = second_sub[d]; 
//                d=d+1;
//              }
//          }
        
//     }
// }