import java.util.Scanner;
public class TemperatureCheck{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);

      System.out.print("Enter Todays's Temperature: ");
       int temp = input.nextInt();

      if(temp < 15){
          System.out.println("its Cold and Freezing!!!");
       }
        else if(temp > 15 && temp <= 30){
          System.out.println("its Warm!!");
       }
        else {
          System.out.println("Hot!! out here"); 
       }


    }
}
