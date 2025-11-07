import java.util.Scanner;
public class RangeCheck{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

     System.out.print("Enter range of number between: ");
      int range = input.nextInt();

       if(range > 1 && range <= 100){
            System.out.println("In Range");    
        }
        else{
            System.out.println("Out of Range");
        }
    }
}
