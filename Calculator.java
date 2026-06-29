import java.util.Scanner;
public class Calculator {
    public static double addition(double a,double b){
        return (a+b);
    }
    public static double subtraction(double a,double b){
        return (a-b);
    }
    public static double multiplication(double a,double b){
        return (a*b);
    }
    public static double division(double a,double b){
        if(b==0){
            System.out.println("Division by zero is not possible");
            return 0;
        }
        else{
            return (a/b);
        }
    }
    public static void main(String[] args) {
        double a,b;
        int ch;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            System.out.println("Enter your choice");
            ch = sc.nextInt();
            if(ch<=4){
            System.out.println("Enter first number:");
            a = sc.nextDouble();
            System.out.println("Enter second number:");
            b = sc.nextDouble();
            switch(ch){
                case 1:
                    System.out.println("Result: " + addition(a, b));
                    break;
                case 2:
                    System.out.println("Result: " + subtraction(a, b));
                    break;
                case 3:
                    System.out.println("Result: " + multiplication(a, b));
                    break;
                case 4:
                    System.out.println("Result: " + division(a, b));
                    break;
                }
            }
            else if(ch==5){
            System.out.println("Exiting the program.");
            }
            else{
            System.out.println("Invalid choice. Please try again.");
            }
        }
        while(ch!=5);
        sc.close();
    }
}

