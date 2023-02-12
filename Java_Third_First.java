import java.util.ArrayList;
import java.util.Scanner;

public class Java_Third_First{

    public static ArrayList <Integer> nums = new ArrayList<>();
    private static int size = 0;
    private static Scanner scan = new Scanner(System.in);
    public static void get_nums() {
        System.out.println("Enter the lenght of an array of integers.");
        try{
            size = scan.nextInt();
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Entered not a number of size is to large.");
            Java_Third_First.get_nums();
        }
        System.out.println("Enter integers");       
            for(int i = 0; i < size; i++)
            {
                try{
                    nums.add(scan.nextInt());
                }
                catch (Exception InputMismatchException)
                {
                    System.out.println("Not an integer was entered!");
                }
            }
    }

    public static void find_and_delete_even() {
        int foo = 0;
        for(int i = 0; i < nums.size(); i++)
        {
            foo = nums.get(i);
            if (Integer.toBinaryString(foo).endsWith("0"))
                nums.remove(i);
        }
    }

    public static void main(String[] args) {
        String foo = "";
        while(true)
        {
            Java_Third_First.get_nums();
            System.out.println(nums);
            Java_Third_First.find_and_delete_even();
            System.out.println(nums);
            System.out.println("Do you want to terminate the program y/Y ?");
            
            foo = scan.next();
            if(foo.equals("y") || foo.equals("Y"))
                break;
        }
        scan.close();
    }
}