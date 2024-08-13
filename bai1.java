import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap so a: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter the operation (+, -, *, /, %, =): ");
        String choose = scanner.nextLine();
        double result = 0;
        switch (choose) {
            case "+":
                result = a + b;
//                System.out.println("result = " + result );
                break;
            case "-":
                result = a - b;
//                System.out.println("result = " + result);
            case "*":
                result = a * b;
//                System.out.println("result = " + result);
            case "/":
                if(b != 0) {
                    result = a/b;
//                    System.out.println("result = " + result);
                }else {
                    System.out.println("Cannot divide by 0");
                    return;
                }
                break;

            case "%" : {
                result = a % b;
//                System.out.println("result = " + result);
                break;
            }
            default:
                System.out.println("Please choose the calculation");
        }
        System.out.println("result = " + result);

    }
}
