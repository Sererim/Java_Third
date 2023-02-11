import java.util.ArrayList;
import java.util.Scanner;

public class Java_Third_First{

    public static ArrayList <Integer> get_nums() {
        Scanner scan = new Scanner(System.in);
        ArrayList <Integer> nums = new ArrayList<>(); 
        while(true){        
            try {
                System.out.println("Enter integers.");
                nums.add(scan.nextInt());
            }
            catch(Exception InputMismatchException)
            {
                System.out.println("Not an integer was entered!");
            }
            break;
        }
        return nums;
    }

    public static void main(String[] args) {
        Java_Third_First.get_nums();
    }
}