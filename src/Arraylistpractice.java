package DataStructures.src;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistpractice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<Integer>(5); 
        System.out.println("What is the first number you would like to add?");
        myArray.add(Integer.parseInt(input.nextLine()));
        System.out.println("What is the second number you would like to add?");
        myArray.add(Integer.parseInt(input.nextLine()));
        System.out.println("What is the third number you would like to add?");
        myArray.add(Integer.parseInt(input.nextLine()));
        System.out.println("What is the fourth number you would like to add?");
        myArray.add(Integer.parseInt(input.nextLine()));
        System.out.println("What is the fifth number you would like to add?");
        myArray.add(Integer.parseInt(input.nextLine()));
        System.out.println(myArray);
        System.out.println(myArray.get(2));
        int number=0;
        for (int i= 0; i <= (myArray.size()-1) ;i++){
            number = myArray.get(i) +number;
            if (i== (myArray.size()-1)){
                System.out.println("The sum of all the elements in the array is: "+number);
                break; 
            }
            else{
                continue;
            }
        }
        number=1;
        for (int i= 0; i <= (myArray.size()-1) ;i++){
            number = myArray.get(i) *number;
            if (i== (myArray.size()-1)){
                System.out.println("The product of all the elements in the array is: "+number);
                break; 
            }
            else{
                continue;
            }
        }
        // Bring your array to collections for some fun times
        System.out.println("The lowest value in your array is "+ Collections.min(myArray));
        System.out.println("The highest value in your array is "+ Collections.max(myArray));

        
    }
}
