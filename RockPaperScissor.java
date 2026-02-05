import java.util.Random;
import java.util.Scanner;
public  class Main {
    public static void main(String[] args) {
        // System.out.println("Hello World");
        // question 1
        // int n = 4;
        //for (int i=n; i>0; i-- ) {
        //       for (int j=0; j<i; j++ ){
        //   System.out.print("*");}
        //    System.out.print("\n");
        //    }


        // question 2
        // 0 for rock
        // 1 for paper
        // 2 for scissor

        Scanner sc = new Scanner(System.in);
        System.out.print("enter 0 for rock, 1 for paper, 2 for scissors ");
        int userInput = sc.nextInt();


        Random rand = new Random();
        int computerInput = rand.nextInt(3);


        if (userInput == computerInput) {
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1) {
            System.out.println("You Win");
        } else {
            System.out.println("You Lose");
        }


        }
    }
