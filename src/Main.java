//Learning about Methods
import java.util.Scanner;
public class Main{
    // A sum method
    public static int sum(int a, int b){
        int sum = 0;
        for (int i = a; i <= b; i++){
            sum+=i;
        }
            return sum;
    }

    // A max method

    public static int max(int a, int b){
        int max;
        if (a>b){
            max = a;
        }
        else{
            max = b;
        }
        return max;
    }
    public static void main(String [] args){
        // if we want to add a range of number, instead of writing the same code again and again, we
        // can create a method and reuse it easily

        Scanner kbd = new Scanner(System.in);
        System.out.println("What is the first number in your range? ");
        int a = kbd.nextInt();
        System.out.println("What is the second number in your range? ");
        int b = kbd.nextInt();

        System.out.println("The sum of number from " + a + " to " + b + " is "  + sum(a, b)); // sum(a, b) is called calling a method
    }
}