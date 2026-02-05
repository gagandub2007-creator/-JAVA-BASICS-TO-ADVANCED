import java.util.Scanner;

public class first {
    public static void main(String[] args) {
       System.out.println("what is your name?");
       Scanner sc = new Scanner(System.in);
      System.out.println("enter your subject1 marks");
        float subject1 = sc.nextInt();
        System.out.println("enter your subject2 marks");
        float subject2 = sc.nextInt();
        System.out.println("enter your subject3 marks");
        float subject3 = sc.nextInt();
        System.out.println("enter your subject4 marks");
        float subject4 = sc.nextInt();
        System.out.println("enter your subject5 marks");
        float subject5 = sc.nextInt();
        float percentage = ((subject1 + subject2 + subject3 + subject4 + subject5)/500.0f)*100;
        System.out.println("your percentage is ");
        System.out.println(percentage);
    
    }
}      
