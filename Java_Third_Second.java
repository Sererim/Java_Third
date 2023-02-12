import java.text.Format;
import java.util.ArrayList;
import java.util.Scanner;

public class Java_Third_Second{
    
    private static ArrayList <Integer> nums = new ArrayList<>();
    private static Scanner scan = new Scanner(System.in);
    private static int size = 0;

    public static void get_nums() {
        System.out.println("Enter the lenght of an array of integers.");
        try{
            size = scan.nextInt();
        }
        catch (Exception InputMismatchException)
        {
            System.out.println("Entered not a number of size is to large.");
            Java_Third_Second.get_nums();
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

    private static String get_min_max()
    {
        int[] min_max = {nums.get(0), nums.get(0)}; // {min , max}

        for(int i = 0; i < size; i++)
        {
            if(min_max[0] > nums.get(i))
                min_max[0] = nums.get(i);
            if(min_max[1] < nums.get(i))
                min_max[1] = nums.get(i);
        }
        String bar = "min: " + min_max[0] + " max: " + min_max[1];
        return bar;
    }

    private static int get_mean_num()
    {
        int foo = 0;
        for(int i = 0; i < size; i++)
            foo += nums.get(i);
        return (foo / size);
    }

    public static void main(String[] args) {
        String foo = "";
        while(true)
        {
            Java_Third_Second.get_nums();
            System.out.println(nums);
            System.out.println(Java_Third_Second.get_min_max());
            System.out.println(Java_Third_Second.get_mean_num());

            System.out.println("Do you want to terminate the program y/Y ?");
            foo = scan.next();
            if(foo.equals("y") || foo.equals("Y"))
                break;
        }
        scan.close();
    }
}