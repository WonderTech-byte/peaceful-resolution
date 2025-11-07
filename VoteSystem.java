import java.util.Scanner;
public class VoteSystem{
    public static void main(String[]arg){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Age to Vote: ");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You are Eligible to vote");
        }else{
            System.out.println("You are not Eligible to vote");
        }

    }
}
