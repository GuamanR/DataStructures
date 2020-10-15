package DataStructures.src;

import java.util.HashMap;
import java.util.Scanner;


/**
 * DataStructures1
 */
public class DataStructures1 {

    
    Scanner input = new Scanner(System.in);

    public void run(){
        HashMap <String, String> carDealer = new HashMap<>();
        carDealer.put("Hyundai","Sonata");
        carDealer.put("Honda","Civic");
        carDealer.put("Honda","Accord");
        carDealer.put("Honda","Fit");
        carDealer.put("Honda","Odyssey");
        carDealer.put("Honda","Ridgeline");
        carDealer.put("Hyundai","Elantra"); 
        carDealer.put("Hyundai","Accent");
        carDealer.put("Hyundai","Santa Fe");
        carDealer.put("Hyundai","Tuscon");
        System.out.println("What make are you looking for?");
        String request = input.nextLine();
        System.out.println("Here is what we have in stock: ");
        System.out.println(carDealer.get(request));
        // How to return an array list of all possible values?



 
    }
    


        
    }



