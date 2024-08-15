import java.sql.SQLOutput;
import java.util.Scanner;

public class bai4 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String choice;
            do {
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Address: ");
                String address = scanner.nextLine();
                System.out.println("Age: ");
                int age = Integer.parseInt(scanner.nextLine());

                System.out.println("Thông tin sinh viên:");
                System.out.println("Tên: " + name);
                System.out.println("Địa chỉ: " + address);
                System.out.println("Tuổi: " + age);
                System.out.print("Do you want to continue? (Y/N): ");
                choice = scanner.nextLine();
            } while(choice.equalsIgnoreCase("y"));
            System.out.println("The end.");

            }
        }



