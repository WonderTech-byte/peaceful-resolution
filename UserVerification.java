import java.util.Scanner;
public class UserVerification{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);

       String name = "samuel";
       int password = 4321;

       System.out.println("-------------LOG IN-----------");

       System.out.print("Enter User Name: ");
        String userName = input.nextLine();
    
       System.out.print("Enter Password to Log: ");
        int userPassword = input.nextInt();

         if(userPassword == password && name.equals(name)){
                System.out.println("Log in Successful.........");
         }else{
             System.out.println("Log in Failed.....");  
         }

    }
}
