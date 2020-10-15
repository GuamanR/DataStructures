package DataStructures.src;

import java.lang.reflect.Method;
import java.util.Arrays;


// Second problem with the following code will print a value of 2 because it does not get tp the thrid string because 6>5
// double[] exampleArray = {1,5,6,5,4,1};
// double maximum = exampleArray[0];
// int index = 0;
// for(int i = 1; i<exampleArray.length; i++){
// if (exampleArray[i] > maximum) {
// maximum = exampleArray[i];
// index = i;
//     }
//     }
// System.out.println(index);
public class DataStructures2 {
    double[] giveArray = {6, 9, 8, 3, 4, 1, 6, 5, 8, 1, 3}; 

    public static void toPower(int size, int power) {
        int[] newbie = new int [size];
        

        for (int i=0; i < size;i++ ){ 
            int nermber= 1;
            for (int j=1; j<=power; j++){
                nermber = i*nermber; 
                if (j==power){
                    newbie[i]= nermber;
                    continue;

                }
            }

             
            
        }
        System.out.println("Your new array is "+ Arrays.toString(newbie));
        
    }
    



    public void run() {
        double summer = 0; 
    for (int i = 0; i<giveArray.length; i++){
        summer += giveArray[i];
    }
    System.out.println("The sum of the preset array is "+summer);


    
        
    }

}
