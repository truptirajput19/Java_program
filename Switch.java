import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
      System.out.println(" Enter + for addition \n Enter - for subtraction \nEnter * for multiplication\n Enter / for division");
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the choise");
         char operator=sc.next().charAt(0);
         System.out.println("Enter the numbers:");
         int a=sc.nextInt();
         int b=sc.nextInt();
         
         switch(operator)
         {
            case '+':System.out.println("addition = "+(a+b));
            break;
            case '-':System.out.println("subtraction = "+(a-b));
            break;
            case '*':System.out.println("multiplication = "+(a*b));
            break;
            case '/':System.out.println("Division = "+(a/b));
            break;
            default:System.out.println("Invalid input");
         }

    }
}
