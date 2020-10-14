import java.util.Scanner;
import java.util.ArrayList;

public class App {

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
    }
}
