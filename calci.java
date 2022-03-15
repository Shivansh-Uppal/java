import java.util.Scanner;

class calci {
  public static void main(String[] args) {

    char op;
    Double num1, num2, res;

    Scanner input = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    op = input.next().charAt(0);


    System.out.println("Enter first number");
    num1 = input.nextDouble();

    System.out.println("Enter second number");
    num2 = input.nextDouble();

    switch (op) {

      case '+':
        res = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + res);
        break;

      
      case '-':
        res = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + res);
        break;

    
      case '*':
        res = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + res);
        break;

     
      case '/':
        res = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + res);
        break;

      default:
        System.out.println("Invalid operator!");
        break;
    }

    input.close();
  }
}
