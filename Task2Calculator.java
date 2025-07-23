import java.util.Scanner;

public class Task2Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input from user
        System.out.println("Enter first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter second number:");
        double num2 = sc.nextDouble();

        System.out.println("choose operation + - * /");
        char operator = sc.next().charAt(0);
        double result;

        //switch case to perform operation
        switch (operator) {
            case '+':
                    result = num1 + num2;
                    System.out.println("Result:" + result);
                
                break;
            case '-':
                    result = num1 -num2;
                    System.out.println("Result:" + result);
                break;
            case '*':
                    result = num1 * num2;
                    System.out.println("Result:" + result);
                break;
            case '/':
                  if(num2 != 0){
                    result = num1 / num2;
                    System.out.println("Result:" + result);
                  }else{
                    System.out.println("Can not divide by zero");
                  }
                break;
            default:
                   System.out.println("Invalid Operator!");
                break;
        }
        sc.close();
 }
    
}
